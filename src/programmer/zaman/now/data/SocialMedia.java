package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

//final class Facebook extends SocialMedia{
//
//}

// error karena tidak bisa mewariskan class final
//class FakeFacebook extends  Facebook{
//
//}




class Facebook extends SocialMedia{
    final void login(String username, String password){
        // isi method
    }
}

 //error karena tidak bisa override method final
//class FakeFacebook extends  Facebook{
//     void login(String username, String password){
//         // isi method
//     }
//}
