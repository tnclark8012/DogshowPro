Using Apache PDFBox
-------------------
(http://pdfbox.apache.org/commandlineutilities/ExtractText.html)

ExtractText

This application will extract all text from the given PDF document.

usage: java -jar pdfbox-app-x.y.z.jar ExtractText [OPTIONS] <PDF file> [Text file]

Command Line Parameter	Type	Default Value	Description
-password <password>	string	None	The password to the PDF document.
-encoding <output encoding>	string	default encoding	The encoding type of the text file, e.g. ISO-8859-1, UTF-8, UTF-16BE.
-console	boolean	false	Send text to console instead of file.
-html	boolean	false	Output in HTML format instead of raw text.
-sort	boolean	false	Sort the text before writing
-ignoreBeads	boolean	false	Disables the separation by beads.
-force	boolean	false	Enables pdfbox to ignore corrupt objects.
-debug	boolean	false	Enables debug output about the time consumption of every stage.
-startPage <start page>	integer	1	The first page to extract, one based.
-endPage <end page>	integer	Integer.MAX_INT	The last page to extract, one based.
-nonSeq	boolean	false	Use the new non sequential parser.
