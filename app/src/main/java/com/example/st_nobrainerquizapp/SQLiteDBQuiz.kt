package com.example.st_nobrainerquizapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteDBQuiz (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "quiz_database"
        private const val DATABASE_VERSION = 1

        const val TABLE_QUIZ = "quiz"
        const val COLUMN_QUIZ_ID = "id"
        const val COLUMN_TITLE = "title"
        const val COLUMN_SUBTITLE = "subtitle"
        const val COLUMN_TIME = "time"

        const val TABLE_QUESTION = "question"
        private const val COLUMN_QUESTION_ID = "question_id"
        const val COLUMN_QUIZ_ID_FK = "quiz_id"
        const val COLUMN_QUESTION = "question"
        const val COLUMN_OPTIONS = "options"
        const val COLUMN_CORRECT = "correct"
        const val COLUMN_HINT = "hint"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createQuizTable = """
            CREATE TABLE $TABLE_QUIZ (
                $COLUMN_QUIZ_ID TEXT PRIMARY KEY,
                $COLUMN_TITLE TEXT,
                $COLUMN_SUBTITLE TEXT,
                $COLUMN_TIME TEXT
            )
        """

        val createQuestionTable = """
            CREATE TABLE $TABLE_QUESTION (
                $COLUMN_QUESTION_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_QUIZ_ID_FK TEXT,
                $COLUMN_QUESTION TEXT,
                $COLUMN_OPTIONS TEXT,
                $COLUMN_CORRECT TEXT,
                $COLUMN_HINT TEXT,
                FOREIGN KEY($COLUMN_QUIZ_ID_FK) REFERENCES $TABLE_QUIZ($COLUMN_QUIZ_ID)
            )
        """

        db.execSQL(createQuizTable)
        db.execSQL(createQuestionTable)

        insertInitialData(db)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_QUIZ")
        db.execSQL("DROP TABLE IF EXISTS $TABLE_QUESTION")
        onCreate(db)
    }

    private fun insertInitialData(db: SQLiteDatabase) {
        val quizSets = listOf(
            QuizModel("1", "Wildlife", "Animal Kingdom", "8", getWildlifeQuestions()),
            QuizModel("2", "Birds", "Feathered Friends", "10", getBirdQuestions()),
            QuizModel("3", "South Africa", "Land of Diversity", "10", getSouthAfricaQuestions()),
            QuizModel("4", "Africa", "Continental Wonders", "5", getAfricaQuestions()),
            QuizModel("5", "Atlas", "Geography Exploration", "8", getAtlasQuestions())
        )

        quizSets.forEach { quiz ->
            val quizValues = ContentValues().apply {
                put(COLUMN_QUIZ_ID, quiz.id)
                put(COLUMN_TITLE, quiz.title)
                put(COLUMN_SUBTITLE, quiz.subtitle)
                put(COLUMN_TIME, quiz.time)
            }
            db.insert(TABLE_QUIZ, null, quizValues)

            quiz.questionList.forEach { question ->
                val questionValues = ContentValues().apply {
                    put(COLUMN_QUIZ_ID_FK, quiz.id)
                    put(COLUMN_QUESTION, question.question)
                    put(COLUMN_OPTIONS, question.options.joinToString(","))
                    put(COLUMN_CORRECT, question.correct)
                    put(COLUMN_HINT, question.hint)
                }
                db.insert(TABLE_QUESTION, null, questionValues)
            }
        }
    }

    private fun getWildlifeQuestions(): List<QuestionModel> {
        return listOf(
            QuestionModel("What is the fastest land animal?", listOf("Cheetah", "Lion", "Tiger", "Leopard"), "Cheetah", "It reaches speeds up to 70 mph."),
            QuestionModel("Which animal is known as the king of the jungle?", listOf("Lion", "Tiger", "Elephant", "Cheetah"), "Lion", "It's known for its majestic appearance."),
            QuestionModel("Which mammal can fly?", listOf("Bat", "Squirrel", "Monkey", "Owl"), "Bat", "The only mammal capable of true flight."),
            QuestionModel("What animal has the longest lifespan?", listOf("Elephant", "Blue Whale", "Galapagos Tortoise", "Parrot"), "Galapagos Tortoise", "It can live over 100 years."),
            QuestionModel("Which marine animal has eight arms?", listOf("Octopus", "Shark", "Dolphin", "Starfish"), "Octopus", "It's known for its intelligence.")
        )
    }

    private fun getBirdQuestions(): List<QuestionModel> {
        return listOf(
            QuestionModel("What bird is known for its colorful tail feathers?", listOf("Peacock", "Sparrow", "Eagle", "Ostrich"), "Peacock", "It’s a symbol of beauty."),
            QuestionModel("Which bird is the largest in the world?", listOf("Ostrich", "Eagle", "Penguin", "Parrot"), "Ostrich", "It can't fly but is incredibly fast."),
            QuestionModel("Which bird can mimic human speech?", listOf("Parrot", "Sparrow", "Crow", "Hawk"), "Parrot", "It can learn and repeat sounds."),
            QuestionModel("What is the fastest bird?", listOf("Peregrine Falcon", "Eagle", "Hawk", "Sparrow"), "Peregrine Falcon", "It can dive at speeds over 200 mph."),
            QuestionModel("Which bird is known for its migratory patterns?", listOf("Swallow", "Sparrow", "Penguin", "Parrot"), "Swallow", "It travels long distances seasonally.")
        )
    }

    private fun getSouthAfricaQuestions(): List<QuestionModel> {
        return listOf(
            QuestionModel("What is South Africa’s largest city?", listOf("Johannesburg", "Cape Town", "Pretoria", "Durban"), "Johannesburg", "It’s known as the City of Gold."),
            QuestionModel("What is South Africa’s official currency?", listOf("Rand", "Dollar", "Euro", "Pound"), "Rand", "It's abbreviated as ZAR."),
            QuestionModel("What is the national animal of South Africa?", listOf("Springbok", "Lion", "Elephant", "Buffalo"), "Springbok", "A symbol of speed and agility."),
            QuestionModel("What is the longest river in South Africa?", listOf("Orange River", "Vaal River", "Limpopo River", "Zambezi River"), "Orange River", "It flows into the Atlantic Ocean."),
            QuestionModel("What mountain overlooks Cape Town?", listOf("Table Mountain", "Drakensberg", "Magaliesberg", "Outeniqua"), "Table Mountain", "It’s a famous tourist attraction.")
        )
    }

    private fun getAfricaQuestions(): List<QuestionModel> {
        return listOf(
            QuestionModel("What is the longest river in Africa?", listOf("Nile", "Congo", "Zambezi", "Limpopo"), "Nile", "It flows northward into the Mediterranean Sea."),
            QuestionModel("What desert is the largest in Africa?", listOf("Sahara", "Kalahari", "Namib", "Libyan"), "Sahara", "It’s the world’s largest hot desert."),
            QuestionModel("What island is located off the east coast of Africa?", listOf("Madagascar", "Seychelles", "Mauritius", "Comoros"), "Madagascar", "It’s known for unique wildlife."),
            QuestionModel("Which country has the highest population in Africa?", listOf("Nigeria", "Egypt", "South Africa", "Kenya"), "Nigeria", "It’s the most populous African nation."),
            QuestionModel("What is Africa’s highest mountain?", listOf("Kilimanjaro", "Everest", "Kenya", "Elgon"), "Kilimanjaro", "Located in Tanzania.")
        )
    }

    private fun getAtlasQuestions(): List<QuestionModel> {
        return listOf(
            QuestionModel("What is the highest mountain in the world?", listOf("K2", "Everest", "Kangchenjunga", "Lhotse"), "Everest", "It’s over 29,000 feet high."),
            QuestionModel("What is the longest river in the world?", listOf("Nile", "Amazon", "Yangtze", "Mississippi"), "Nile", "It flows through northeastern Africa."),
            QuestionModel("What is the smallest country in the world?", listOf("Monaco", "Vatican City", "San Marino", "Liechtenstein"), "Vatican City", "Spiritual center of the Catholic Church."),
            QuestionModel("Which country has the most time zones?", listOf("France", "Russia", "USA", "China"), "France", "Its territories span multiple continents."),
            QuestionModel("What ocean is the largest?", listOf("Pacific", "Atlantic", "Indian", "Southern"), "Pacific", "Larger than all landmasses combined.")
        )
    }



    fun getAllQuizzes(): List<QuizModel> {
        val quizList = mutableListOf<QuizModel>()
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_QUIZ", null)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_QUIZ_ID))
                val title = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_TITLE))
                val subtitle = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_SUBTITLE))
                val time = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_TIME))
                val questionList = getQuestionsByQuizId(id)

                quizList.add(QuizModel(id, title, subtitle, time, questionList))
            } while (cursor.moveToNext())
        }
        cursor.close()
        return quizList
    }

    fun getQuestionsByQuizId(quizId: String): List<QuestionModel> {
        val questionList = mutableListOf<QuestionModel>()
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_QUESTION WHERE $COLUMN_QUIZ_ID_FK=?", arrayOf(quizId))

        if (cursor.moveToFirst()) {
            do {
                val question = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_QUESTION))
                val options = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPTIONS)).split(",")
                val correct = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_CORRECT))
                val hint = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_HINT))

                questionList.add(QuestionModel(question, options, correct, hint))
            } while (cursor.moveToNext())
        }
        cursor.close()
        return questionList
    }

}