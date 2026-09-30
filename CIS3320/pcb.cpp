#include <iostream>
#include <fstream>
#include <string>
using namespace std;

// PCB object
struct PCB {
    int pid;
    string status;
    int priority;
};

// Queue to process PCBs
class PCBQueue{
private:

    static constexpr int MAX_QUEUE_SIZE = 10; // Max number of PCBs the queue can hold
    PCB pcb_items[MAX_QUEUE_SIZE];
    int head;
    int length;

public:

    PCBQueue() : head(0), length(0) {}
    bool isEmpty() const { return length == 0; }
    bool isFull() const { return length == MAX_QUEUE_SIZE; }

    // Function to add a pcb to the queue. 
    bool put(const PCB& p) {
        if (isFull()) return false;

        int tail = (head + length) % MAX_QUEUE_SIZE; 
        pcb_items[tail] = p;
        length++;
        return true;
    }

    // Function to retrieve pcb from the queue.
    bool get(PCB& p) {
        if (isEmpty()) return false;

        p = pcb_items[head];
        head = (head + 1) % MAX_QUEUE_SIZE;
        length--;
        return true;
    }

    // Prints contents of the queue.
    void print() const {
        cout << "List of " << length << " CPU Jobs in PCB queue: \n";
        cout << left << "PID\tStatus\tPriority\n";
        for(int i = 0; i < length; i++){
            const PCB& p = pcb_items[(head + i) % MAX_QUEUE_SIZE];
            cout << left << p.pid << "\t" << p.status << "\t" << p.priority << endl; 
        }
        cout << "\n";
    }
};

int main() {
    PCBQueue queue; // Creates queue object

    ifstream file("data.txt"); //Opens data file
    if (!file){
        cerr << "Error opening data.txt\n";
        return 1;
    }

    // adds every pcb to the queue until the queue is full.
    PCB ip;
    while (file >> ip.pid >> ip.status >> ip.priority){ 
        if (queue.put(ip)) {
            cout << "Added PID " << ip.pid << " to queue.\n";
        } else {
            cout << "Unable to add PID " << ip.pid << ", queue is full.\n";
        }
    }
    file.close();
    cout << "\n";
    
    // prints contents of the queue
    queue.print();

    // pops the pcb from the head of the queue
    PCB op;
    if (queue.get(op)){
        cout << "Removed PID " << op.pid << " from queue.\n";
    }
    cout << "\n";
    
    //prints contents of the queue
    queue.print();

    return 0;
}
