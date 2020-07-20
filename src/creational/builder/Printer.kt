package creational.builder

class Printer{

    fun connect() = println("Connect!")

    fun setFileName(text: String) = println("File name $text")

    fun setTitle(text: String) = println("Title $text")

    fun showTitle() = println("Show Title")

    fun print() = println("Print file $this")
}

class PrinterBuilder(){

    constructor(init: PrinterBuilder.() -> Unit): this(){
        init()
    }

    fun build(): Printer{
        val printer = Printer()

        return printer
    }
}