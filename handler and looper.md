## Handler and Looper
### Какая у них особенность?
* Помогает избавится от состоянии гонок
* Нет необходимости постоянно создавать новый поток, Looper будет переиспользовать уже созданный

Любой поток может иметь единственный уникальный Looper, спасибо ThreadLocal.

### Чем отличается Thread от HandlerThread?
HandlerThread содержит внутри себя Handler, Looper и MessageQueue. 

Почему этого нет в Thread? Потому что Handler, Looper и MessageQueue являются компонентами андройд архитектуры и поэтому сделали специальный класс HandlerThread, который это содержит.
### Есть ли Looper у Активити?
Да, по сути, активити и есть HandlerThread, с помощью post мы можем отправить событие в Handler, который его выполнит в ui потоке.