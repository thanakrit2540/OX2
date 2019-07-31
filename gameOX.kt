
var col = 0
var row = 0
var n = 1
var x = 0
var o = 0
var d = 0

val arr = arrayOf(
    arrayOf ( "  ", "1 " ,"2 " , "3 "),
    arrayOf ( "1 ", "- " ,"- " , "- " ),
    arrayOf ( "2 ", "- " ,"- " , "- " ),
    arrayOf ( "3 ", "- " ,"- " , "- " )
)

fun main(){
    var player = "X"




while (true){
    try{
        checkwin()


        if(n%2 ==0) player = "O"
        else player = "X"


        for (i in arr.indices){
            for(j in arr[i].indices){
                print("${arr[i][j]}")
            }
            println()
        }
        if(n==10) {
            println("Draw")
            break
        }
        n ++
        if(x==1){
            println("Player X win!")
            break
        }
        if(o==1){
            println("Player O win!")
            break
        }
        println("Turn of player ${player}")
        while (true){
            println("Enter col :")
            val a : String? = readLine()
            col = a?.toInt()!!
            if(col > 3 ){
                println("Please enter correct index of number!")
                n--
                continue
            }
            break
        }
       while (true){
           println("Enter row :")
           val b : String? = readLine()

           row = b?.toInt()!!
           if( row > 3){
               println("Please enter correct index of number!")
               n--
               continue
           }
           break
       }


        if(arr[row][col]=="X "||arr[row][col]=="X "){
            println("Please enter again!")
            n--
            continue
        }
        arr[row][col] = "${player} "

    }catch (e: Throwable){
        println("Please enter number!")
        n--
        continue
    }




}

}

fun checkwin(){
    if(arr[1][1].equals("X ")&&arr[2][2].equals("X ")&&arr[3][3].equals("X ")) x = 1
    else if(arr[3][1].equals("O ")&&arr[2][2].equals("O ")&&arr[1][3].equals("O ")) o = 1
}


