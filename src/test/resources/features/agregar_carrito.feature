# language: es
Característica: agregar al carrito
  Yo como comprador
  Quiero agregar elementos a un carrito de compras
  Para posteriormente comprar

  Escenario: agregar un control de juegos al carrito de compras
    Cuando agrego un "control de pc" al carrito
    Entonces debe verse 1 item en el carrito de compras

  Escenario: agregar 3 items al carrito de compras
    Cuando Carlos agrega al carrito los items
      | control gamer pc |
      | mouse gaming     |
      | teclado gaming   |
    Entonces debe verse 3 items en el carrito de compras