public #include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Function to reverse a circular linked list
Node* reverseCircularList(Node* head) {
    if (!head || head->next == head)
        return head;

    Node *prev = nullptr, *curr = head, *next = nullptr;
    Node* tail = head;

    // Find the last node to stop the loop
    do {
        tail = tail->next;
    } while (tail->next != head);

    do {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    } while (curr != head);

    head->next = prev;  // original head becomes last, point it to new head
    return prev;        // new head
}
 guiu {
    
}
