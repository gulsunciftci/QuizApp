package com.example.quizapp
//We use the setData method to assign the value to Data.
object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1=QuestionData(
            1,
            "Who is the author of the story The Little Prince?",
            "Samed Behrengi",
            "Charles Dicknes",
            "George Orwell",
            "Antoine de Saint-Exupéry",
            4

        )
        var question2=QuestionData(
            2,
            "Which city is not in Scandinavia?",
            "Reykjavík",
            "Kopenhag",
            "Gothenburg",
            "Istanbul",
            1

        )
        var question3=QuestionData(
            3,
            "What is the international dialing code of Turkey?",
            "+23",
            "+90",
            "+453",
            "+40",
            2

        )
        var question4=QuestionData(
            4,
            "Which planet is farther from the Sun?",
            "Venus",
            "Mars",
            "Uranus",
            "Neptune",
            3

        )
        var question5=QuestionData(
            5,
            "Which one is a prime number?",
            "6",
            "8",
            "4",
            "7",
            4

        )


        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)

        return que
    }
}