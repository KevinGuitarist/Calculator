package com.kevinguitarist.calculatorapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevinguitarist.calculatorapp.ui.theme.CalcColor


@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Column() {
        Column(
            modifier = Modifier
                .fillMaxSize().background(color = Color.Black),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
                    .clip(MaterialTheme.shapes.medium)
                    .background(Color.Black)
            ) {
                Text(
                    text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 72.dp, horizontal = 8.dp),
                    fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                    color = Color.White,
                    maxLines = 2
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize().weight(1f).padding(10.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "C",
                        modifier = Modifier
                            .background(CalcColor.grey)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Clear)
                        }
                    )
                    CalculatorButton(
                        symbol = "Del",
                        modifier = Modifier
                            .background(CalcColor.grey)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Delete)
                        }
                    )
                    CalculatorButton(
                        symbol = "%",
                        modifier = Modifier
                            .background(CalcColor.grey)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Percent))
                        }
                    )
                    CalculatorButton(
                        symbol = "/",
                        modifier = Modifier
                            .background(CalcColor.orange)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                        }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "7",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(7))
                        }
                    )
                    CalculatorButton(
                        symbol = "8",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(8))
                        }
                    )
                    CalculatorButton(
                        symbol = "9",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(9))
                        }
                    )
                    CalculatorButton(
                        symbol = "x",
                        modifier = Modifier
                            .background(CalcColor.orange)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                        }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "4",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(4))
                        }
                    )
                    CalculatorButton(
                        symbol = "5",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(5))
                        }
                    )
                    CalculatorButton(
                        symbol = "6",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(6))
                        }
                    )
                    CalculatorButton(
                        symbol = "-",
                        modifier = Modifier
                            .background(CalcColor.orange)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                        }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "1",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(1))
                        }
                    )
                    CalculatorButton(
                        symbol = "2",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(2))
                        }
                    )
                    CalculatorButton(
                        symbol = "3",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(3))
                        }
                    )
                    CalculatorButton(
                        symbol = "+",
                        modifier = Modifier
                            .background(CalcColor.orange)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                        }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "0",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(2f)       //Used to adjust image size (image ratio)
                            .weight(2f),
                        onClick = {
                            onAction(CalculatorAction.Number(0))
                        }
                    )
                    CalculatorButton(
                        symbol = ".",
                        modifier = Modifier
                            .background(CalcColor.darkblack)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Decimal)
                        }
                    )
                    CalculatorButton(
                        symbol = "=",
                        modifier = Modifier
                            .background(CalcColor.orange)
                            .aspectRatio(1f)       //Used to adjust image size (image ratio)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Calculate)
                        }
                    )
                }
            }
        }
    }
}