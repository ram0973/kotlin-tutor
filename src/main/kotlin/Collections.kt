fun collections() {
    // Read only list with explicit type declaration
    val readOnlyShapes: List<String> = listOf("triangle", "square", "circle")
    println("List of string: $readOnlyShapes") // [triangle, square, circle]
    println("List of string length: ${readOnlyShapes.size}")
    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println("Mutable List of string: $shapes") // [triangle, square, circle]
}