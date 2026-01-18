package hello

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class HelloSpec extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "Hello Module"

    it should "compute input + 1" in {
        // 启动仿真
        test(new Hello) { c =>
            // 测试用例 1: 输入 0
            c.io.in.poke(0.U)      // 设置输入为 0
            c.clock.step(1)        // 前进一个时钟周期
            c.io.out.expect(1.U)   // 期望输出是 1

            // 测试用例 2: 输入 41
            c.io.in.poke(41.U)     // 设置输入为 41
            c.clock.step(1)
            c.io.out.expect(42.U)  // 期望输出是 42
            
            println("Test pass!")
        }
    }
}