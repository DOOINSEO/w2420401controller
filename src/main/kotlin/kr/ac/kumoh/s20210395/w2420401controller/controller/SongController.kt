package kr.ac.kumoh.s20210395.w2420401controller.controller

import kr.ac.kumoh.s20210395.w2420401controller.model.Song
import kr.ac.kumoh.s20210395.w2420401controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController (val service: SongService){
//    val title = listOf(
//        "Ditto",
//        "How Sweet",
//        "Hypeboy",
//    )

    @GetMapping("/song/list")
    fun getSongList(): List<Song>{//(): 이렇게 붙어있으면 함수의 타입 지정
        return service.getAllSongs()
    }

    @GetMapping("/song/random")
    fun getRandomSong(): String{
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
            </head>
            <body>
                <div class="card text-center">
              <div class="card-header">
                추천 노래
              </div>
              <div class="card-body">
                <h5 class="card-title">사랑에 연습이 있었다면</h5>
                <p class="card-text">임재현</p>
                <a 
                    href="https://www.youtube.com/results?search_query=노래방+사랑에 연습이 있었다면" 
                    class="btn btn-primary">
                    노래방
                </a>
              </div>
              <a 
                href="https://www.youtube.com/results?search_query=사랑에 연습이 있었다면" 
                class="btn btn-secondary">
                뮤직 비디오
              </a>
            </div>
            </body>
            </html>
        """.trimIndent()
    }
}
