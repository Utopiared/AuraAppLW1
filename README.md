# Atelier AI — Módulo de Autenticación y Bienvenida (dos Activities, sin Fragments)

Proyecto Android nativo (Kotlin + Views/Material Components 3) listo para abrir en Android Studio.

## Cómo abrir el proyecto
1. Descomprime `AtelierAIProject.zip`.
2. Android Studio → **File > Open** → selecciona la carpeta `AtelierAIProject`.
3. Espera a que Gradle sincronice (requiere internet la primera vez).
4. **Run > Run 'app'** en un emulador/dispositivo con Android 8.0 (API 26) o superior.

## Credenciales de prueba
- **Usuario:** `user@tic.unam.mx`
- **Contraseña:** `d1pl0m0v1l35?`

## Arquitectura (dos Activities, sin Fragments)

- **`LoginActivity`** (Activity de lanzamiento): infla `res/layout/activity_login.xml`
  (`TextInputLayout`/`TextInputEditText` para correo y contraseña —el ícono
  de mostrar/ocultar contraseña usa el `endIconMode="password_toggle"` nativo
  de Material Components— y un `MaterialButton` de bordes rectos). Contiene
  toda la lógica de validación: campos vacíos, formato de correo
  (`Patterns.EMAIL_ADDRESS`), credenciales exactas, y botón deshabilitado
  hasta llenar ambos campos (`TextWatcher`). Al autenticar con éxito, navega
  a `WelcomeActivity` mediante un `Intent`, enviando el correo como extra
  (`EXTRA_EMAIL`).

- **`WelcomeActivity`**: infla `res/layout/activity_welcome.xml`. Recibe el
  correo autenticado desde `intent.getStringExtra(EXTRA_EMAIL)` y lo usa
  para personalizar el mensaje de bienvenida
  (`welcome_message_personalized`).

- **Navegación**: `startActivity(Intent(...))` desde `LoginActivity`, con
  `overridePendingTransition` usando los mismos recursos de `res/anim/`
  (fade + slide, 500 ms, interpolador `fast_out_slow_in`) para conservar la
  transición cinemática de las prácticas anteriores.

## Configuración técnica
- Kotlin + Android Views + Material Components 3 (`com.google.android.material:material`)
- `AppCompatActivity`, **View Binding** habilitado (`buildFeatures.viewBinding = true`)
- Sin Jetpack Compose y sin Fragments
- `minSdk` = 26, `compileSdk` = 34, `targetSdk` = 34
- Gradle con Kotlin DSL (`build.gradle.kts`)

## Estructura relevante
```
AtelierAIProject/
├── build.gradle.kts
├── settings.gradle.kts
└── app/
    ├── build.gradle.kts
    └── src/main/
        ├── AndroidManifest.xml            (declara LoginActivity como LAUNCHER y WelcomeActivity)
        ├── java/mx/unam/tic/asistentemoda/
        │   ├── LoginActivity.kt
        │   └── WelcomeActivity.kt
        └── res/
            ├── layout/
            │   ├── activity_login.xml
            │   └── activity_welcome.xml
            ├── color/                                  (estados habilitado/enfocado)
            │   ├── button_container_color.xml
            │   ├── button_text_color.xml
            │   ├── text_input_box_stroke_color.xml
            │   └── text_input_hint_color.xml
            ├── anim/                                   (transición entre Activities)
            │   ├── enter_fade_slide_up.xml
            │   ├── exit_fade_slide_left.xml
            │   ├── pop_enter_fade_slide_right.xml
            │   └── pop_exit_fade_slide_down.xml
            ├── drawable/ic_scan_frame.xml, ic_launcher_background.xml, ic_launcher_foreground.xml
            ├── mipmap-anydpi/ic_launcher.xml, ic_launcher_round.xml
            ├── values/colors.xml, strings.xml, themes.xml
            ├── values-en/strings.xml
            └── xml/backup_rules.xml, data_extraction_rules.xml
```

## Notas de implementación
- Todas las cadenas de texto siguen en `strings.xml` (español) y
  `values-en/strings.xml` (inglés) — internacionalización intacta.
- La identidad visual (negro mate, marfil, gris grafito, oro satinado, botón
  de bordes rectos, campos delineados) se mantiene igual a la versión con
  Fragments.
- El correo autenticado se comunica entre pantallas exclusivamente a través
  del `Intent` (`putExtra` / `getStringExtra`), como corresponde a una
  navegación entre Activities.
