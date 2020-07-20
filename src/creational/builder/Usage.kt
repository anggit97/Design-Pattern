package creational.builder

import java.io.File

fun dialog(init: DialogBuilder.() -> Unit): Dialog {
    return DialogBuilder(init).build()
}

fun printer(init: PrinterBuilder.() -> Unit): Printer {
    return PrinterBuilder(init).build()
}

fun main() {
    val dialog: Dialog = dialog {
        title {
            text = "Dialog Title"
        }
        message {
            text = "Dialog Message"
            color = "#333333"
        }
        image {
            File.createTempFile("image", "jpg")
        }
    }
    dialog.show()
    dialog.show()

    val printer: Printer = printer {

    }
    printer.print()
    printer.print()
}