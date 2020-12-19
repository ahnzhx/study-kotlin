package entity


data class Classroom(val table: String) {
    var chair: String = ""

    constructor(table: String, chair: String): this(table){
        this.chair = chair
    }

}