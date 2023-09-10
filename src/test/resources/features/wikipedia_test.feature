Feature: Interacciones con la pagina "Wikipedia"

  #Escenario 01
  Scenario:Validar el titulo de la pagina principal de Wikipedia
    Given El usuario ingresa a la pagina Wikipedia
    When El usuario ingresa a la pagina principal de Wikipedia
    Then El usuario debe visualizar el titulo "Bienvenidos a Wikipedia"

  #Escenario 02
  Scenario: Realizar una busqueda del termino "Sistema"
    Given El usuario ingresa a la pagina Wikipedia
    When El usuario busca el termino "Sistema"
    Then El usuario debe visualizar el titulo de la busqueda "Sistema"

  #Escenario 03
  Scenario: Realizar una busqueda del mensaje Análisis CEEM dentro de la pagina Sistema
    Given El usuario ingresa a la pagina Wikipedia
    When El usuario busca el termino "Sistema"
    And El usuario hace scroll hasta la parte inferior
    Then El usuario debe visualizar el mensaje "Análisis CEEM"

  #Escenario 04
  Scenario Outline: Crear una nueva cuenta
    Given El usuario ingresa a la pagina Wikipedia
    When El usuario ingresa a la pagina principal de Wikipedia
    And El usuario da clic al boton crear cuenta
    And El usuario llena el formulario de registro con los siguientes datos "<usuario>", "<contrasena>", "<correo>" y envia el formulario
    Then El usuario debe visualizar el pop up del captcha requerido
    Examples:
      | usuario  | contrasena | correo              |
      | ipulido  | I123654789 | testing@testing.com |

  #Escenario 05
  Scenario: Validar la versión para moviles
    Given El usuario ingresa a la pagina Wikipedia
    When El usuario hace scroll y da clic en la opcion version para moviles
    Then El usuario debe visualizar la opcion de version para escritorio
    And El usuario regresa a la opcion para moviles

  #Escenario 06
  Scenario: Comparar dos versiones de la pagina en el historial de versiones
    Given El usuario ingresa a la pagina Wikipedia
    And El usuario ingresa a la pagina principal de Wikipedia
    When El usuario selecciona la opcion Ver historial
    And El usuario selecciona una version a comparar y da clic sobre el boton Comparar versiones seleccionadas
    And El usuario debe visualizar la dos versiones de la pagina