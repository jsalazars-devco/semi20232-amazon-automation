# language: es
Característica: agregar tarjeta de regalo al carrito
  Yo como comprador
  Quiero agregar una tarjeta de regalo al carrito de compras
  Para posteriormente comprarla

  Escenario: agregar una tarjeta de regalo al carrito de compras
    Cuando busco una tarjeta de regalo
    Y quiero comprarla de 10 dolares para el correo "example@email.com" y agregarla al carrito
    Entonces debe verse 1 item en el carrito de compras