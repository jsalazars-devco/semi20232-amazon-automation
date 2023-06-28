# language: es
Característica: agregar un item de una lista de regalos al carrito
  Yo como comprador
  Quiero agregar un item de una lista de regalos al carrito de compras
  Para posteriormente comprarlo

  Escenario: agregar un item de una lista de regalos al carrito de compras
    Dado que Juan esta en la pagina de listas de amazon
    Cuando busca la lista de "John" y agrega un item al carrito de compras
    Entonces debe verse 1 item en el carrito de compras