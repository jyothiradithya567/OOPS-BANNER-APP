#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Banner {

private:
    class CharacterPattern {
    private:
        char character;
        vector<string> pattern;

    public:
        CharacterPattern(char c, vector<string> p) {
            character = c;
            pattern = p;
        }

        vector<string> getPattern() {
            return pattern;
        }
    };

public:
    static void printBanner() {

        vector<CharacterPattern> letters;

        letters.push_back(CharacterPattern('O', {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        }));

        letters.push_back(CharacterPattern('P', {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        }));

        letters.push_back(CharacterPattern('S', {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        }));

        for(int i = 0; i < 5; i++) {
            for(auto c : letters) {
                cout << c.getPattern()[i] << " ";
            }
            cout << endl;
        }
    }
};

int main() {
    Banner::printBanner();
    return 0;
}