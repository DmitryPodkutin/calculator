 ### Задача: “Калькулятор”

#### Описание:

Создайте консольное приложение “Калькулятор”. Приложение должно читать из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.

#### Требования:

1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)!
2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
3. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
4. Калькулятор умеет работать только с целыми числами.
5. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор выбросить исключение и прекратить свою работу.
6. При вводе римских чисел, ответ ,будет выведен римскими цифрами, соответственно, при вводе арабских - ответ будет арабскими цифрами.
7. При вводе неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
8. При вводе строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.

#### Пример работы программы:

```
Enter a Mathematical Operation: 3*5
Result: 15

Enter a Mathematical Operation: X*VII
Result: LXX
```
