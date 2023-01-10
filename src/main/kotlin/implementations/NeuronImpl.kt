package implementations

import interfaces.Neuron
import java.util.Random

class NeuronImpl(val studyCoeff: Double): Neuron {

    private var weight: Double = Random().nextDouble() * 0.1

    override fun calculate(inputValue: Double): Double {
        TODO("Not yet implemented")
    }

    override fun update(updateValue: Double): Boolean {
        TODO("Not yet implemented")
    }
}