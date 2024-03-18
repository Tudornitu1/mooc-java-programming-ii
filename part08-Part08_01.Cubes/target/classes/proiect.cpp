#include <iostream>
#include <vector>
#include <string>
#include <cstdlib>
#include <cstring>

class EventLocation {
private:
    int maxSeats;
    int numZones;
    int seatsPerZone;

public:
    EventLocation(int maxSeats, int numZones, int seatsPerZone) {
        this->maxSeats = maxSeats;
        this->numZones = numZones;
        this->seatsPerZone = seatsPerZone;
    }

    int GetMaxSeats() const {
        return maxSeats;
    }

    int GetNumZones() const {
        return numZones;
    }

    int GetSeatsPerZone() const {
        return seatsPerZone;
    }
};

class Event {
private:
    std::string name;
    std::string date;
    std::string time;

public:
    Event(const std::string& name, const std::string& date, const std::string& time) {
        this->name = name;
        this->date = date;
        this->time = time;
    }

    const std::string& GetName() const {
        return name;
    }

    const std::string& GetDate() const {
        return date;
    }

    const std::string& GetTime() const {
        return time;
    }
};


class Ticket {
private:
    int eventID;
    std::string type;
    int seatNumber;
    std::string uniqueID;

public:
    static int ticketCount;
    static int uniqueIDCounter;

    Ticket(int eventID, const std::string& type, int seatNumber) {
        this->eventID = eventID;
        this->type = type;
        this->seatNumber = seatNumber;
        GenerateUniqueID();
        ticketCount++;
    }

    int GetEventID() const {
        return eventID;
    }

    const std::string& GetType() const {
        return type;
    }

    int GetSeatNumber() const {
        return seatNumber;
    }

    const std::string& GetUniqueID() const {
        return uniqueID;
    }

    static int GetTicketCount() {
        return ticketCount;
    }

    void DisplayTicketInfo() const {
        std::cout << "Event ID: " << eventID << "\n";
        std::cout << "Ticket Type: " << type << "\n";
        std::cout << "Seat Number: " << seatNumber << "\n";
        std::cout << "Unique ID: " << uniqueID << "\n";
    }

private:
    void GenerateUniqueID() {
        uniqueID = std::to_string(uniqueIDCounter++);
    }
};

int Ticket::ticketCount = 0;
int Ticket::uniqueIDCounter = 1;


int main() {
    // Read event location characteristics
    int maxSeats, numZones, seatsPerZone;
    std::cout << "Enter max seats: ";
    std::cin >> maxSeats;
    std::cout << "Enter number of zones: ";
    std::cin >> numZones;
    std::cout << "Enter seats per zone: ";
    std::cin >> seatsPerZone;

    EventLocation eventLocation(maxSeats, numZones, seatsPerZone);

    // Read event characteristics
    std::cin.ignore(); 
    std::string eventName, eventDate, eventTime;
    std::cout << "Enter event name: ";
    std::getline(std::cin, eventName);
    std::cout << "Enter event date: ";
    std::cin >> eventDate;
    std::cout << "Enter event time: ";
    std::cin >> eventTime;

    Event event(eventName, eventDate, eventTime);

    int eventID = 1;
    int numTickets;
    std::cout << "Enter the number of tickets to generate: ";
    std::cin >> numTickets;

    std::vector<Ticket> tickets;

    for (int i = 0; i < numTickets; i++) {
        std::string ticketType;
        int seatNumber;

        std::cout << "Enter ticket type (VIP or Standard): ";
        std::cin >> ticketType;

        std::cout << "Enter seat number: ";
        std::cin >> seatNumber;

        if (seatNumber >= 1 && seatNumber <= eventLocation.GetMaxSeats()) {
            Ticket ticket(eventID, ticketType, seatNumber);
            tickets.push_back(ticket);
            std::cout << "Ticket generated with unique ID: " << ticket.GetUniqueID() << "\n";
        }
        else {
            std::cout << "Seat number is invalid. Please try again.\n";
        }
    }

    // Display ticket information
    for (const Ticket& ticket : tickets) {
        ticket.DisplayTicketInfo();
        std::cout << "--------------------------------------\n";
    }

    return 0;
}