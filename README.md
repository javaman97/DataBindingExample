# DataBindingExample

A simple Android application demonstrating the implementation of **Jetpack Data Binding**, **LiveData**, and **ViewModel**.

## Features

- **Data Binding**: Uses declarative layout files to bind UI components directly to data sources.
- **Two-Way Data Binding**: Demonstrates how to sync data between a `ViewModel` and an `EditText` using `@={}`.
- **LiveData**: Reactive UI updates when the underlying data changes in the ViewModel.
- **ViewModel**: Lifecycle-aware data management.
- **Event Handling**: Binding click events directly in XML to ViewModel functions.

## Project Structure

- **`MainActivity.kt`**: Initializes the `DataBindingUtil` and sets the `ViewModel`.
- **`QuoteViewModel.kt`**: Contains `MutableLiveData` for the user's name and a quote, along with a function to update the quote.
- **`activity_main.xml`**: The layout file wrapped in a `<layout>` tag, defining the data variables and binding them to views like `TextView`, `EditText`, and `Button`.

## How it Works

1.  The `TextView` displays a name from the `ViewModel` using one-way binding: `android:text="@{viewModel.name}"`.
2.  The `EditText` allows editing a quote with two-way binding: `android:text="@={viewModel.quote}"`.
3.  The `Button` triggers a function in the `ViewModel` to update the quote: `android:onClick="@{() -> viewModel.updateQuote()}"`.

## Getting Started

1.  Clone this repository.
2.  Open the project in **Android Studio**.
3.  Ensure Data Binding is enabled in your `app/build.gradle.kts`:
    ```kotlin
    buildFeatures {
        dataBinding = true
    }
    ```
4.  Build and run the application on an emulator or physical device.

## Prerequisites

- Android Studio Koala or newer.
- Kotlin 2.x.
- Android SDK Level 34+.
