package com.example.st_nobrainerquizapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScoreboardAdapter(private val userScores: List<UserScore>) : RecyclerView.Adapter<ScoreboardAdapter.ScoreViewHolder>() {

    inner class ScoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.userNameTextView)
        val userScoreTextView: TextView = itemView.findViewById(R.id.userScoreTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_score, parent, false)
        return ScoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScoreViewHolder, position: Int) {
        val userScore = userScores[position]
        holder.userNameTextView.text = userScore.name
        holder.userScoreTextView.text = userScore.score.toString()
    }

    override fun getItemCount(): Int = userScores.size
}
