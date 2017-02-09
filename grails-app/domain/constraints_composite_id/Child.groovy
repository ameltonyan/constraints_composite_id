package constraints_composite_id

class Child {
    String name

    static belongsTo = [parent: Parent]

    static constraints = {
    }

    static mapping = {
        id composite: ['name', 'parent']

        columns {
            parent {
                column name: 'COD'
                column name: 'DSC'
            }
        }
    }
}
