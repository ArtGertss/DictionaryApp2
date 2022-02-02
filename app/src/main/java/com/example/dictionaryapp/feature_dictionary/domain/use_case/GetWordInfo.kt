package com.example.dictionaryapp.feature_dictionary.domain.use_case

import com.example.dictionaryapp.core.util.Resource
import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo
import com.example.dictionaryapp.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): kotlinx.coroutines.flow.Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()){
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}