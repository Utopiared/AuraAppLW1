<div align="center">

# 🔐 Login App - Android Studio con Kotlin

### 📱 Formulario de Inicio de Sesión y Pantalla de Bienvenida

<img src="https://img.shields.io/badge/Android-Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white">
<img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white">
<img src="https://img.shields.io/badge/Material_Design-6200EE?style=for-the-badge&logo=materialdesign&logoColor=white">

**Proyecto desarrollado como práctica de programación móvil utilizando Android Studio y Kotlin.**
# 👨‍💻 Autor

**Aura Nicte-Ha Pech Reyes**


Diplomado en Desarrollo de Aplicaciones Móviles

2026

---

---

</div>

# 📖 Descripción

Esta aplicación consiste en el desarrollo de un **sistema de autenticación (Login)** para dispositivos Android, implementado mediante **Android Studio** utilizando el lenguaje de programación **Kotlin**.

El objetivo principal es permitir que un usuario ingrese sus credenciales para acceder a una segunda pantalla donde se le dará la bienvenida después de una autenticación exitosa.

La aplicación fue desarrollada siguiendo buenas prácticas de programación, utilizando interfaces modernas y una navegación sencilla entre actividades.

---

# 🎯 Objetivo

Desarrollar una aplicación móvil que implemente un proceso de autenticación básico mediante un formulario de inicio de sesión, validando credenciales predefinidas y mostrando una pantalla de bienvenida cuando el acceso sea correcto.

---

# 📋 Instrucciones de la práctica

Desarrolle una aplicación para Android utilizando el **IDE oficial Android Studio** y el lenguaje **Kotlin**, que implemente un formulario de inicio de sesión (**Login**) y una pantalla de bienvenida posterior a la autenticación.

La aplicación deberá permitir al usuario ingresar sus credenciales para acceder a una segunda pantalla que mostrará un mensaje de bienvenida cuando la autenticación sea exitosa.

---

# ✅ Requerimientos Funcionales

## 🔑 Pantalla de Inicio de Sesión

La interfaz debe contener los siguientes elementos:

- 📧 Campo para correo electrónico.
- 🔒 Campo para contraseña.
- 🔘 Botón **Iniciar Sesión**.

---

## 👤 Credenciales de Acceso

Para que la autenticación sea considerada **exitosa**, deberán utilizarse las siguientes credenciales:

| Usuario | Contraseña |
|----------|------------|
| **user@tic.unam.mx** | **d1pl0m0v1l35?** |

---

## 🎉 Pantalla de Bienvenida

Después de ingresar correctamente las credenciales:

- Se abrirá una segunda Activity.
- Se mostrará un mensaje de bienvenida.
- Puede incluir:
  - 🎨 Imágenes
  - ✨ Animaciones
  - 🎯 Iconos
  - 🌈 Elementos visuales que mejoren la experiencia del usuario.

---

# 🛠 Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| ☕ Kotlin | Lenguaje principal del proyecto |
| 🤖 Android Studio | IDE de desarrollo |
| 📱 Android SDK | Desarrollo de aplicaciones móviles |
| 🎨 Material Design | Diseño de la interfaz |
| 🖼 XML | Diseño de las vistas |
| 🔄 Intent | Navegación entre pantallas |

---

# 📂 Estructura del Proyecto

```
app/
│
├── java/
│   └── com.example.login
│       ├── MainActivity.kt
│       ├── WelcomeActivity.kt
│
├── res/
│   ├── layout/
│   │      activity_main.xml
│   │      activity_welcome.xml
│   │
│   ├── drawable/
│   ├── mipmap/
│   └── values/
│
└── AndroidManifest.xml
```

---

# ⚙ Funcionamiento

## 1️⃣ Inicio

El usuario abre la aplicación.

⬇

## 2️⃣ Captura de Datos

Introduce:

- Correo electrónico
- Contraseña

⬇

## 3️⃣ Validación

La aplicación compara las credenciales ingresadas con las almacenadas.

⬇

## 4️⃣ Resultado

### ✔ Correctas

Se abre la pantalla de bienvenida.

### ❌ Incorrectas

Se muestra un mensaje indicando que las credenciales son inválidas.

---

# 💻 Lógica Implementada

La autenticación se realiza mediante una validación sencilla utilizando estructuras condicionales (`if`).

El sistema verifica que el correo electrónico y la contraseña coincidan exactamente con los valores definidos.

En caso contrario, se informa al usuario mediante un mensaje en pantalla.

---

# 📸 Capturas de Pantalla

## Pantalla de Login

> *<img width="430" height="748" alt="image" src="https://github.com/user-attachments/assets/f7d7eaa5-64cc-410c-a8b0-28e4b973694e" />
*

```
📷 login.png
```

---

## Pantalla de Bienvenida

> *<img width="453" height="802" alt="image" src="https://github.com/user-attachments/assets/9fd68202-3610-48fe-a175-5659284be6b8" />
*

```
📷 welcome.png
```

---

# 🚀 Características

- ✔ Interfaz intuitiva
- ✔ Validación de usuario
- ✔ Navegación entre Activities
- ✔ Uso de Intents
- ✔ Diseño moderno
- ✔ Compatible con Android Studio
- ✔ Código desarrollado completamente en Kotlin

---


<div align="center">

## ⭐ **¡Gracias por visitar este proyecto!**

</div>
