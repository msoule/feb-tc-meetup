# Feburary Twin Cities Scala Meetup
## Hack Night

This project provides an easy and fun graphical programming challenge in Scala. Based off of a toy Scala graphics library called Doodle. There's even a free ebook.

Doodle: https://github.com/underscoreio/doodle

EBook: https://underscore.io/training/courses/creative-scala/

## Exercises

### Provided example:

```
  // From section 7.1 of Creative Scala
  def row(n: Int): Image = {
    n match {
      case 0 => Image.rectangle(30, 30).lineColor(Color.black)
      case _ =>
        val unit = row(n-1)
        unit.beside(unit)
    }
  }
```

### #1 Grid

Using the provided example, create a grid of squares. The height and width of the grid should be 2^n, where n is the input to the function.

```
  def grid(n: Int): Image = ???
``` 

### #2 Random colors

From the grid exercise, fill the squares with random colors.

### #3 Sierpinkski

Using the techniques from the previous exercises, create Sierpinkski triangles.

```
  def sierpinkski(n: Int): Image = ???
```

### #4 Flood fill

Given a grid filled with colors, we want to pick a square to fill with a different color which floods out to all connected squares of the same color. Like the bucket tool in your favorite image editing software.

Check out this page on flood fill algorithms: https://en.wikipedia.org/wiki/Flood_fill

Don't feel constrained to use the same techniques from the previous exercises or the ebook. Be creative and experiment. 