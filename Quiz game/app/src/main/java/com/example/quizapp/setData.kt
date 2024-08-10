package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "有關台灣的主題樂園與所在地，下列配對何者錯誤？",

            "劍湖山世界→雲林縣",
            "六福村主題遊樂園→桃園縣",
            "麗寶樂園→台中市",
            "義大遊樂世界→高雄市",
            2
        )
        var question2 = QuestionData(
            2,
            "狗的種類繁多，下列品種與原產地的配對何者錯誤？",

            "西施→中國",
            "吉娃娃→英國",
            "臘腸狗→德國",
            "拉布拉多→加拿大",
            2
        )
        var question3 = QuestionData(
            3,
            "我們生活當中重要的交通號誌紅綠燈，其中「紅、綠」的由來為何？",

            "餐廳出餐與否的代表顏色",
            "發明者的喜好",
            "工廠工人工作休息的帽子顏色",
            "女性已婚未婚的衣服顏色",
            4
        )
        var question4 = QuestionData(
            4,
            "請問下列何者是全世界第一大咖啡生產國？",

            "墨西哥",
            "南非",
            "哥倫比亞",
            "巴西",
            4
        )

        var question5 = QuestionData(
            5,
            "有關台灣的老街與所在縣市，下列配對何者錯誤？",

            "內灣老街→新竹縣",
            "鹿港老街→彰化縣",
            "九份老街→台北市",
            "安平老街→台南市",
            3
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}