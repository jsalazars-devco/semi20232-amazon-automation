# language: es
  @exclude
Característica: Agregar un item a una lista de regalos creada

  @manual
  @manual-result:passed
  Escenario: Agregar un item a una lista de regalos creada
    Dado que hay una lista de regalos creada
    Cuando agrego un item a la lista
    Entonces puedo ver el item en la lista de regalos