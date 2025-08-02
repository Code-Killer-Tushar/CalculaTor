# Calculator App

A simple calculator application built with **Jetpack Compose** for Android. This calculator performs basic arithmetic operations with a clean, modern UI.

## Features

- ✅ **Basic Operations**: Addition (+), Subtraction (-), Multiplication (×), Division (÷)
- ✅ **Clear Function**: AC button to clear all input
- ✅ **Backspace**: Delete last entered digit
- ✅ **Real-time Display**: Shows current input and calculation results
- ✅ **Material Design**: Clean, modern UI with proper spacing and colors
- 🚧 **Decimal Support**: Currently in development

## Screenshots

*Add screenshots of your calculator app here*

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: Single Activity with Composable functions
- **State Management**: `remember` and `mutableStateOf`

## Project Structure

```
com.example.calculator/
├── Calculator.kt           # Main calculator composable and logic
├── ui/theme/
│   ├── Color.kt           # Custom colors (LightGray, Orange)
│   └── Theme.kt           # App theme configuration
└── MainActivity.kt        # Entry point
```

## How It Works

### Core Components

1. **Calculator Composable**: Main UI component that handles the calculator layout
2. **result() Function**: Processes mathematical expressions and returns calculated results
3. **State Management**: Uses `mutableStateOf` to track the current screen display

### Calculation Logic

The calculator uses string manipulation to parse and evaluate expressions:
- Splits input string by operators (+, -, ×, ÷)
- Converts string numbers to Double values
- Performs arithmetic operations based on detected operator
- Returns formatted result (removes trailing .0 for whole numbers)

## Installation

1. Clone this repository
```bash
git clone https://github.com/yourusername/calculator-app.git
```

2. Open the project in Android Studio

3. Sync project with Gradle files

4. Run the app on an emulator or physical device

## Usage

1. **Numbers**: Tap number buttons (0-9) to input values
2. **Operations**: Tap +, -, ×, or ÷ to select operation
3. **Calculate**: Tap = to get the result
4. **Clear**: Tap AC to clear all input
5. **Delete**: Tap ⌫ to remove last digit

## Code Highlights

### Display Screen
```kotlin
Text(
    text = if (screen.toString() == "0") "" else screen.toString(),
    fontSize = 40.sp,
)
```

### Button Layout
```kotlin
Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceEvenly
) {
    // Calculator buttons
}
```

### Operation Logic
```kotlin
fun result(screen: String): Double {
    var result = 0.0
    val symbols = listOf("+", "-", "x", "÷")
    // Parsing and calculation logic
    return result
}
```

## Known Issues & Limitations

- **Single Operation**: Currently supports only one operation at a time
- **Decimal Point**: Decimal functionality is not yet implemented
- **Error Handling**: Limited error handling for invalid inputs
- **Chain Operations**: Cannot chain multiple operations

## Future Enhancements

- [ ] Add decimal point support
- [ ] Implement chain calculations
- [ ] Add memory functions (M+, M-, MR, MC)
- [ ] Include scientific calculator functions
- [ ] Add calculation history
- [ ] Implement keyboard input support
- [ ] Add haptic feedback
- [ ] Support for parentheses

## Color Scheme

- **Number Buttons**: Dark Gray background with Light Gray text
- **Operation Buttons**: Orange background with Black text
- **Function Buttons**: Gray background with Black text

## Requirements

- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 34 (Android 14)
- **Compile SDK**: API 34

## Dependencies

```kotlin
implementation 'androidx.compose.ui:ui'
implementation 'androidx.compose.material3:material3'
implementation 'androidx.activity:activity-compose'
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact


⭐ **Star this repository if you found it helpful!**