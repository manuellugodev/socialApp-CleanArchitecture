package com.lugo.manueln.socialapp.data.PostComplete.repository.dataSource


import com.lugo.manueln.socialapp.domain.Comments
import io.reactivex.Observable

interface PostCommentsDataSource{

   fun getCommentsPost(idPost: Int):Observable<List<Comments>>

}