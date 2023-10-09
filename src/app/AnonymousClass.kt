package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        printString("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    fireAction(object : Action {
        override fun action() = printString("Action one")
    })
    fireAction(object : Action {
        override fun action() = printString("Action two")
    })
}