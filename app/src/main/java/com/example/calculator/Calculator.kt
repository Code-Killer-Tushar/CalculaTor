package com.example.calculator

import android.hardware.lights.Light
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.Orange


@Composable
fun Calculator() {
    var screen by remember {
        mutableStateOf("")
    }

    val symbols = listOf("+", "-", "x", "÷")

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),


            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = if ( screen.toString() == "0" ) "" else screen.toString(),
                            fontSize = 40.sp,

                            )
                    }
                }
            }

            Divider()


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                // 1st row for buttons
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        ,
                    verticalArrangement = Arrangement.SpaceEvenly

                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Button(
                            onClick = {
                            screen = ""
                            },
                            modifier = Modifier
                                .weight(1f)
                                .height(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.Gray)
                        ) {
                            Text(
                                text = "AC",
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }

                        Spacer(modifier = Modifier.padding(2.5.dp))

                        Button(
                            onClick = {

                                if (screen.isNotEmpty()) {
                                    val newNumberString = screen.dropLast(1)
                                    screen = if (newNumberString.isEmpty()) "" else newNumberString
                                }
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.Gray)
                        ) {
                            Text(
                                text = "⌫",
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }

                        Spacer(modifier = Modifier.padding(2.5.dp))

                        Button(
                            onClick = {
                                if (screen != "" &&  symbols[0] !in screen && symbols[1] !in screen && symbols[2] !in screen && symbols[3] !in screen ) {
                                    screen = screen + symbols[3] // ÷
                                }
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Orange)
                        ) {
                            Text(
                                text = symbols[3],
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }


                    }

                    //2nd row for buttons

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = {
                                screen = screen + "1"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "1",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "2"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "2",
                                fontSize = 50.sp,
                                color = LightGray

                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "3"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "3",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                if (screen != "" &&  symbols[0] !in screen && symbols[1] !in screen && symbols[2] !in screen && symbols[3] !in screen ) {
                                    screen = screen + symbols[2] // x
                                }
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Orange)
                        ) {
                            Text(
                                text = symbols[2],
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }
                    }

                    //3rd row for buttons

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = {
                                screen = screen + "4"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "4",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "5"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "5",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "6"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "6",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                if (screen != "" &&  symbols[0] !in screen && symbols[1] !in screen && symbols[2] !in screen && symbols[3] !in screen ) {
                                    screen = screen + symbols[1] // -
                                }
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Orange)
                        ) {
                            Text(
                                text = symbols[1],
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }
                    }

                    //4th row for buttons

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = {
                                screen = screen + "7"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "7",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "8"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "8",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                screen = screen + "9"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "9",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Button(
                            onClick = {
                                if (screen != "" && symbols[0] !in screen && symbols[1] !in screen && symbols[2] !in screen && symbols[3] !in screen ) {
                                    screen = screen + symbols[0] // +
                                }
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Orange)
                        ) {
                            Text(
                                text = symbols[0],
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }
                    }

                    //last row for buttons

                    Row(
                        modifier = Modifier
                    ) {
                        Button(
                            onClick = {
                                // Working on! Decimal function in working progress...


                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = ".",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Spacer(modifier = Modifier.padding(2.5.dp))

                        Button(
                            onClick = {
                                screen = screen + "0"
                            },
                            modifier = Modifier.size(90.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(
                                text = "0",
                                fontSize = 50.sp,
                                color = LightGray
                            )
                        }

                        Spacer(modifier = Modifier.padding(2.5.dp))

                        Button(
                            onClick = {

                            },
                            modifier = Modifier
                                .weight(1f)
                                .height(90.dp),
                            colors = ButtonDefaults.buttonColors(Orange)
                        ) {
                            Text(
                                text = "=",
                                fontSize = 50.sp,
                                color = Color.Black
                            )
                        }


                    }
                }
            }
        }
    }
}