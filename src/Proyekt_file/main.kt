package Proyekt_file

import java.util.Scanner

fun main() {
    val input=Scanner(System.`in`)
    val serwer=Myinterface()
    while (true){
        println("1->AddFile, 2->DeleteFile, 3->RepleceFile, 4->KidirishFile")
        when(input.nextInt()){
            1->serwer.addFile()
            2->serwer.deleteFile()
            3->serwer.replaceFile()
            4->serwer.kidirishFile()
        }
    }
}