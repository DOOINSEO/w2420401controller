package kr.ac.kumoh.s20210395.w2420401controller.repository

import kr.ac.kumoh.s20210395.w2420401controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1,"Ditto", "Newjeans"),
        Song(2,"How Sweet", "Newjeans"),
        Song(3,"Hypeboy", "Newjeans"),
    )

    fun fetchSong() = songs
}