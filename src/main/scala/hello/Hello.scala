package hello

import chisel3._

class Hello extends Module {
    val io = IO(new Bundle {
        val in = Input(UInt(8.W)) // 8位宽的输入信号
        val out = Output(UInt(8.W)) // 8位宽的输出信号
    })

    // 核心逻辑：输出 等于 输入 加 1
    io.out := io.in + 1.U

    // 打印调试信息（仿真时会在终端看到）
    printf("Input: %d, Output: %d\n", io.in, io.out)
}