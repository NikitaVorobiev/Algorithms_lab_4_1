package implementations

import interfaces.AnswerChooser

/**
 * В начале работы здесь создается массив нейронов в количестве, равном числу пикселей изучаемого изображения.
 *
 * Затем начинается обучение, продолжающееся до тех пор, пока все исходные изображения не будут распознаны корректно.
 * После этого можно выбрать одно из изображений и передать его сети для получения ответа.
 */
class AIAnswerChooser: AnswerChooser {

    /**
     * Коэффициент обучения, который передается в нейрон при инициации.
     */
    private val studyCoeff: Double = 0.025

    /**
     * Значение, которое должно быть пересечено для понимания того, что переданное изображение соответствует изученному.
     */
    private val correctCoeff: Double = 0.5

    override fun getAnswer(question: String): String {
        TODO("Not yet implemented")
    }
}