# MVVM (Model-View-ViewModel)

![Kotlin MVVM](https://i.ytimg.com/vi/l7bVVdGBCSA/maxresdefault.jpg)

MVVM es un patrón de arquitectura de software que se utiliza principalmente en el desarrollo de aplicaciones para separar la lógica de negocio y la interfaz de usuario, facilitando así el mantenimiento y la escalabilidad del código. Sirve como un puente entre la interfaz de usuario (UI) y los datos de la aplicación. Su principal función es gestionar y preparar los datos que la interfaz de usuario necesita mostrar, sin que esta tenga que preocuparse de cómo se obtienen o procesan esos datos.

---
# Model

El **Modelo** representa la lógica de negocio y los datos de la aplicación. Es responsable de gestionar el estado y la persistencia de los datos, así como de la lógica de negocio asociada a ellos. El Modelo no tiene conocimiento de la Vista ni del ViewModel, lo que permite que sea independiente y reutilizable.

# View

La **Vista** es responsable de la representación de la interfaz de usuario (UI). Incluye todos los elementos visuales y define el layout y la apariencia de la aplicación. La Vista se suscribe a las actualizaciones del ViewModel para reflejar los cambios de estado en la UI. Sin embargo, la Vista no contiene lógica de negocio ni manipulación directa de datos.

# ViewModel

El **ViewModel** actúa como intermediario entre el Modelo y la Vista. Su principal responsabilidad es manejar la lógica de presentación y la comunicación con el Modelo. El ViewModel expone datos y comandos que la Vista puede enlazar (bind) para mostrar información y gestionar la interacción del usuario. A diferencia de la Vista, el ViewModel no tiene conocimiento directo de los elementos de la UI, lo que promueve una separación clara de responsabilidades.

![MVVM Architecture](https://dz2cdn1.dzone.com/storage/temp/15427079-1638696232906.png)

### Beneficios de MVVM

1. **Separación de Responsabilidades**: Al dividir la aplicación en tres componentes distintos, se facilita el mantenimiento y la prueba del código.
2. **Reutilización del Código**: Los modelos y ViewModels pueden reutilizarse en diferentes Vistas, lo que reduce la duplicación de código.
3. **Facilidad de Pruebas**: Los ViewModels pueden probarse de manera independiente sin necesidad de una UI real.
4. **Desarrollo Colaborativo**: Permite que los desarrolladores y diseñadores trabajen en paralelo, ya que los desarrolladores pueden enfocarse en la lógica de negocio y los diseñadores en la UI.

### Estructura de Proyecto

```plaintext
app/
├── src/
│   ├── main/
│   │   ├── java/com/tuapp/
│   │   │   ├── data/
│   │   │   │   ├── model/
│   │   │   │   │   └── Tarea.kt
│   │   │   │   ├── repository/
│   │   │   │   │   └── TareaRepository.kt
│   │   │   ├── ui/
│   │   │   │   ├── view/
│   │   │   │   │   └── TareaActivity.kt
│   │   │   │   ├── viewmodel/
│   │   │   │   │   └── TareaViewModel.kt
│   │   │   └── App.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_tarea.xml
│   │   │   └── values/
│   │   │       └── strings.xml
│   │   └── AndroidManifest.xml
├── build.gradle
└── settings.gradle

