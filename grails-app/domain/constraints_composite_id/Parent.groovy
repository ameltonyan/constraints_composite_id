package constraints_composite_id

class Parent {

    String code
    String desc

    static hasMany = [childs: Child]

    static constraints = {
    }

    static mapping = {
        id composite: ['code', 'desc']

        code column: 'COD'
        desc column: 'DSC'
    }
}
