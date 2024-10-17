Feature: Product-Store

  @ProductStore
  Scenario Outline: Validation del precio de un producto
    Given estoy en la página de la tienda
    And me logueo con mi usuario "<user>" y clave "<password>"
    When navego a la categoria "<categoria>" y subcategoria "<subCategoria>"
    And agrego "<unidades>" unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito

    Examples:

      | user                                | password       | categoria   | subCategoria | unidades |
      # Caso válido: Con un usuario y contraseña válidos
      | roberto_lozano_flores96@hotmail.com | qalabweb#      | Clothes     | Men          | 2        |
      # Caso inválido: Con un usuario y clave inválidos
      | user_invalido@hotmail.com           | clave_invalida | Clothes     | Men          | 2        |
      # Caso inválido: Con una categoría inexistente
      | roberto_lozano_flores96@hotmail.com | qalabweb#      | Autos       | Men          | 2        |