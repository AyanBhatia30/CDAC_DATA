#include <iostream>
#include <cstdint> // for uintptr_t

int main() {
    int x = 42;

    // Get the address of x
    int* ptr = &x;

    // Cast the pointer to an integer type
    uintptr_t addr = reinterpret_cast<uintptr_t>(ptr);
    std::cout<<"\n ptr = "<<ptr;

    // Print the address as an integer
    std::cout << "\nAddress of x: " << addr << std::endl;

    return 0;
}
