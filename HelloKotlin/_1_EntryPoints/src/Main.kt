fun main() {
    println("Hello World!")

    //println de (") kullanırsak olduğu gibi içindekini ekrana yazdırır
    // sadece parantez kullanırsak içindeki işlemi yapar

    var x = 5
    var y = 4

    // var değişkenleri saklamak için kullanırız

    println(x * y)

    var age = 35
    println(age / 7 * 5)


    val name = "Erkan"
    // sabit değişkenler için val kullanırız
    // val ile tanımladığımız şeylere deperlerini değiştiremeyiz

    var result = age / 7 * 5
    println(result)

    //Defining "tanımlama"
    val myInteger : Int
    myInteger = 10

    //Int tam sayılar için kullanılır
    // kesirli sayılar için Double & float kullanılır
    // Float virgülden sonra 6 7 rakam kullanırken Double da bu sayı çok daha fazla
    val pi = 3.14
    println(pi *2)
    // bir sayının float oluğunu belirtmek için sonuna f koyabiliriz

    // String
    val myString = "Erkan Tanırlı"

    val surname = "Tanırlı"
    val fulname = name + " " + surname
    println(fulname)

    // Boolean doğru ve yanlış değerlerini alabilen değişkenlerde kullanılır
    // genellikle birşeyleri kontrol etmek için kulanırız
    var myBoolaen : Boolean = true
    myBoolaen = false

    println( 3 < 5)
    println( 6 <5 )

    //conversion
    // biz bu öğrendiğimiz int ,float, double gibi ifadeleri birbirine dönüştürebiliriz

    var myNumber = 5
    var myLongNumber = myNumber.toLong()
    println(myLongNumber)
    //bunu internetten ya da kullanıcıdan bir imput aldığımızdadeğiştirmek için kullanacağız


    //örneğin kullanıcıdan ldığım bir imputu çarpmam lazım
    //  var input = "10"
    //   println(input * 2 ) bu işlemi yapmak istedğimde kullanıcıdan aldığım değerin türü String olduğu için çarpmama izin vermiyor
    // bu tür sorunlarla karşılaşmamak için kullanıyoruz
    var input = "10"
    var inputInteger = input.toInt()
    println(inputInteger * 2)


    //Collection
    //Arrays Diziler
    //Arrayslerde kullanamadığımız bazı özellikler var örneğin sonradan diziye eleman ekleme gibi
    val myArray = arrayOf("Erkan","Mehmet","Numan","Oğuzhan")
    println(myArray[0])
    //.set  dizideki elemanın değerini değiştirebiliyoruz
    myArray.set(1,"Mehmet Kesgin")
    println(myArray[1])
    // Dizilerde indexlere çok dikkat etmeliyiz indeksler 0 dan başlar 0 dizimizin ilk değerini verir dizideki indexlerden daha fazlasını kodumuzda kullanırsa uygulama çöker!!!!!!
    val numberArray = arrayOf(1,2,3,4,5)
    println(numberArray[3])
    //eğer karışık bir array oluşturmak istersek yapabiliriz
    val mixedArray = arrayOf("erkan", 5)
    println(mixedArray[1])

    //List - ArrayList de ise bize daha rahatlık sağlıyyor buyüzden daha çok List kullanılıyor

    val myFriends = arrayListOf<String>("Oğuzhan", "Mehmet","Numan")
    println(myFriends[0])
    // Listemize sonradan birşey eklemek istersek aşağıdaki kodu kullanıyoruz
    myFriends.add("Burak")
    println(myFriends[3])
    // Eğer birşeyler eklemek ve bunun yerinide belirlemek istiyorsak aşağıdaki kodu kullanıyoruz
    myFriends.add(0,"Ahmet")
    println(myFriends[0])
    //Arraysde yaptığımız gibi buradada karışık türler içeren bir liste yapabiliriz
    val myMixedFriends = arrayListOf<Any>()
    myMixedFriends.add("Mehmet")
    myMixedFriends.add(3)
    println(myMixedFriends[1])















}