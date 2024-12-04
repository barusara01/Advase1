package Proyekt_file

import java.io.File
import java.util.Scanner

class Myinterface:Interface {
    val input=Scanner(System.`in`)
    val files=ArrayList<Datafile>()
//    var new=input.next()

    override fun addFile() {
        println("Name file: ")
        val new=input.next()
        val namefile=File("C:\\Users\\NEYRON\\papka01\\$new")
        namefile.createNewFile()
        val sel=Datafile(namefile.toString())
        files.add(sel)
    }

    override fun deleteFile() {
        for (i in 0 until files.size){
            println("$i->${files[i]}")
        }
        println("kaysibirini ochirasiz: ")
        val del=input.nextInt()
        files.removeAt(del)
    }

    override fun kidirishFile() {
        for (i in 0 until files.size){
            println("$i->${files[i]}")
        }
        println("Kidirmoqchi bolga file nominingizni yozing: ")
        val kidir=input.nextInt()
        println("chiqdi:${files[kidir].name} manashu joyda joylashgan")
    }

    override fun replaceFile() {
        for (i in 0 until files.size){
            println("$i->${files[i]}")
        }
        println("Kaysibirini ozgartirasiz: ")
        val replay=input.nextInt()
        files.removeAt(replay)
        println("New name file: ")
        val newname=input.next()
        val newfile=File("C:\\Users\\NEYRON\\papka01\\$newname")
        newfile.createNewFile()
        val kosh=Datafile(newfile.toString())
        files.add(kosh)
    }
}