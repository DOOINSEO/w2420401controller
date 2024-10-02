package kr.ac.kumoh.s20210395.w2420401controller.service

import kr.ac.kumoh.s20210395.w2420401controller.model.Song
import kr.ac.kumoh.s20210395.w2420401controller.repository.SongRepository
import org.springframework.stereotype.Service
import kr.ac.kumoh.s20210395.w2420401controller.service.SongService

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}