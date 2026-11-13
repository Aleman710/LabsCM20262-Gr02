# Lab 2 - Podcast Manager, REST Services & Background Workers

> A modern Android audio podcast application built with Jetpack Compose, featuring real-time REST API discovery via Retrofit, automated background synchronization with WorkManager (CoroutineWorkers), Room local persistence, and multi-language support.

**Platform:** Android  
**Language:** Kotlin  
**UI:** Jetpack Compose (Material 3)  
**Architecture:** Clean Architecture + MVI/MVVM + Multi-Module  
**Repository:** [GitHub](https://github.com/Isa-Bedoya-UdeA/LabsCM20262-Gr02)

---

## Overview

This project corresponds to **Laboratorio 2: Workers y consumo de servicios REST** for the Mobile Computing course (LabsCM20262-Gr02) at Universidad de Antioquia. 

Based on Android's official **Jetcaster** sample, this application has been migrated, expanded, and refactored under the official package namespace `co.edu.udea.compumovil.gr02_20262.lab2` with module `:Lab2-Services`. It incorporates real-time podcast discovery through public REST APIs (iTunes Search API), persistent background synchronization managed by Android Jetpack WorkManager (`CoroutineWorker`), system notifications, offline playback capabilities with Room database caching, and full internationalization (English & Spanish).

---

## Features

*   **Live REST API Podcast Discovery (New Feature 1)**:
    *   Direct integration with iTunes Search REST API using **Retrofit 2** and **Gson**.
    *   Search podcasts dynamically by title, author, or genre in real time.
    *   Subscribe to discovered online podcasts and automatically save metadata and artwork to local Room persistence.
*   **Background Sync with WorkManager (New Feature 2)**:
    *   **`PodcastSyncWorker`**: An asynchronous `CoroutineWorker` integrated with Hilt dependency injection (`@HiltWorker`).
    *   Scheduled recurring background updates (`PeriodicWorkRequest` every 6 hours) with `NetworkType.CONNECTED` constraints.
    *   Manual one-time background sync trigger (`OneTimeWorkRequest`).
    *   Local system notification dispatch (`NotificationCompat`) alerting users upon sync completion.
*   **Modular Clean Architecture**:
    *   Decoupled separation across `:core:data`, `:core:domain`, `:core:designsystem`, `:Lab2-Services`, `:tv`, `:wear`, and `:glancewidget`.
    *   Reactive data streams powered by Kotlin Coroutines, StateFlow, and SharedFlow.
*   **Local Caching & Offline Support**:
    *   High-performance Room database storing podcasts, categories, and downloaded episode feeds.
    *   Smart caching headers and disk eviction policies with OkHttp.
*   **Multi-Platform Ecosystem**:
    *   Mobile app (`:Lab2-Services`) for phones and foldables with adaptive pane layouts.
    *   Wear OS smartwatch support (`:wear`).
    *   Android TV support (`:tv`).
    *   Home screen interactive widgets powered by Jetpack Glance (`:glancewidget`).
*   **Internationalization (i18n)**:
    *   Full multi-language support in English (`values/strings.xml`) and Spanish (`values-es/strings.xml`).

---

## Tech Stack

*   **Kotlin**: Modern programming language (v2.x).
*   **Jetpack Compose & Material 3**: Declarative UI toolkit with Material You dynamic styling.
*   **Jetpack Navigation**: Type-safe navigation across screens with animated transitions.
*   **Retrofit 2 & OkHttp 3**: REST client for web services with logging and caching interceptors.
*   **WorkManager**: Asynchronous task scheduling and background execution with `CoroutineWorker`.
*   **Room Database**: Local SQLite abstraction layer with KSP code generation.
*   **Dagger Hilt**: Dependency injection engine for Android components, ViewModels, and Workers.
*   **Coil**: Asynchronous image loading for podcast artwork with caching.

---

## Project Structure

```text
Labs20262-Gr02/
├── Lab2-Services/                          # Main Mobile Application Module
│   └── src/main/java/co/edu/udea/compumovil/gr02_20262/lab2/
│       ├── JetcasterApplication.kt         # Hilt App & WorkManager Configuration.Provider
│       ├── notification/                   # System Notification Manager
│       ├── ui/
│       │   ├── home/                       # Discover, Library, Categories & Home screens
│       │   ├── player/                     # Full audio player screen
│       │   ├── podcast/                    # Podcast details and episode list
│       │   ├── search/                     # Live REST Search Screen & ViewModel
│       │   └── JetcasterApp.kt             # Navigation Host and root Composable
│       └── util/                           # UI utility extensions and helpers
├── core/
│   ├── data/                               # Room DB, DAOs, Retrofit API, Repositories, Workers
│   │   └── src/main/java/co/edu/udea/compumovil/gr02_20262/lab2/core/data/
│   │       ├── database/                   # JetcasterDatabase, entities, and DAOs
│   │       ├── network/                    # Retrofit service, DTOs, and RSS parser
│   │       ├── repository/                 # PodcastsRepository & Store implementations
│   │       └── work/                       # PodcastSyncWorker & WorkManagerSyncManager
│   ├── domain/                             # Domain models and business Use Cases
│   │   └── src/main/java/co/edu/udea/compumovil/gr02_20262/lab2/core/domain/
│   │       ├── SearchPodcastsUseCase.kt    # REST search orchestration
│   │       └── SyncPodcastsUseCase.kt      # WorkManager sync orchestration
│   └── designsystem/                       # Shared M3 Theme, typography, components
├── tv/                                     # Android TV module
├── wear/                                   # Wear OS smartwatch module
└── glancewidget/                           # Jetpack Glance home screen widgets
```

---

## Getting Started

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/Isa-Bedoya-UdeA/LabsCM20262-Gr02.git
    ```
2.  **Open in Android Studio**:
    * Open Android Studio (Ladybug 2024.2.1 / Meerkat or newer).
    * Select `File > Open...` and select the `Labs20262-Gr02` folder.
3.  **Sync & Build**:
    * Allow Gradle to sync dependencies from the Version Catalog (`gradle/libs.versions.toml`).
4.  **Run**:
    * Select `:Lab2-Services` in the run configuration dropdown.
    * Deploy to an emulator or physical device running **Android 8.0 (API 26)** or higher.

---

## License

This project is licensed under the terms specified in the [LICENSE](LICENSE) file (MIT License).

---

## Contributors

**Developers:**

*   **Isabela Bedoya Gaviria**
    *   Institutional: [@Isa-Bedoya-UdeA](https://github.com/Isa-Bedoya-UdeA)
    *   Development / Commits: [@CodeInTheIzzyverse](https://github.com/CodeInTheIzzyverse)
    *   Systems Engineering Student, Universidad de Antioquia
*   **Rafael Angel Aleman Castillo**
    *   GitHub: [@Aleman710](https://github.com/Aleman710)
    *   Systems Engineering Student, Universidad de Antioquia
