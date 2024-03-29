package interfaces

/**
 * Базовый класс нейрона.
 * Нейрон содержит в себе:
 * weight - вес нейрона - значение, которое умножается на входную величину параметра изучаемого объекта (цифровое
 * значение цвета пикселя в рамках задачи)
 * studyCoeff - коэффициент обучения - коэффициент, влияющий на изменение значения веса нейрона
 *
 * При инициализации нейрона вес заполняется случайной небольшой величиной, коэффициент обучения задается извне и
 * является общим
 */
interface Neuron {
    /**
     * Метод рассчета вероятности того, что исследуемый параметр исходного объекта соответствует изученному параметру
     * нейрона. Например, если исследуется черно-белое изображение, то на вход нейрону будет приходить либо 1 либо 0,
     * так как цветов у каждого пикселя всего два. Каждый нейрон изучает один из параметров объекта, в данном случае -
     * один пиксель. Следовательно, итоговая вероятность соответствия представляет собой сумму результатов работы метода
     * calculate() каждого нейрона. Можно считать, что если она составила более чем 0.5, то исследуемый объект является
     * изученным. Иначе - нет.
     */
    fun calculate (inputValue: Double): Double

    /**
     * Метод обновления веса нейрона, использутется для обучения нейрона.
     * Во время обучающих проходов здесь к весу прибавляется разница между ожидаемым и фактическим результатом,
     * умноженная на коэффициент обучения. Таким образом ошибка стримится к нулю. Исходя из задачи необходимо
     * распознавать значение одной из цифр.
     *
     * То есть, если нейрон изучает цифру 5, на вход ему пришел пиксель цифры 4 и итоговым значением всех нейронов стало
     * число 0.4, то из исходного значения 0 (так как 0 означает несоответствие) вычитается 0.4, итоговое -0.6
     * умножается на коэффициент обучение и прибавляется к весу нейрона, соответственно, уменьшая его.
     *
     * Если нейрон изучает цифру 5, на вход ему пришел пиксель цифры 5 и итоговым значением всех нейронов стало число
     * 0.4, то из исходного значения 1 (так как 1 означает соответствие) вычитается 0.4, итоговое 0.6 умножается на
     * коэффициент обучения и прибавляется к весу нейрона, соответственно, увеличивая его.
     */
    fun update (updateValue: Double): Boolean
}