package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Feasts {

	// Year the Pope was Elected
	private int yearPopeElected = 2013;

	// Month the Pope was Elected
	private int monthPopeElected = Calendar.MARCH;

	// Day the Pope was Elected
	private int dayPopeElected = 13;

	// Name of the current reigning Pope
	private String popeName = "Francis";

	/**
	 * Sources for Dates: https://propria.org https://www.catholicculture.org
	 */

	final private String[] january = { "Octive of the Nativity of Our Lord (Circumcission)", // 0
			"The Most Holy Name of Jesus", // 1
			"USA: St Elizabeth Ann Seton, Widow", // 2
			"St Telesphorus, Pope & Martyr", // 3
			"EPIPHANY of our Lord", // 4
			"St Hygenus, Pope & Martyr", // 5
			"The Baptism of the Lord", // 6
			"St Hilary, Bishop, Confessor & Doctor; St Felix", // 7
			"St Paul, the First Hermit, Confessor; St Maurus", // 8
			"St Marcellus I, Pope & Martyr", // 9
			"St Prisca, Virgin & Martyr; Votive Mass of the Chair of St Peter", // 10
			"Ss Marius, Martha, Audifax & Abachum, Martyrs; St Canute, King & Martyr", // 11
			"Ss Fabian, Pope, and Sebastian, Martyrs", // 12
			"St Agnes, Virgin & Martyr", // 13
			"Ss Vincent & Anastasius, Martyrs; USA: Votive Mass for Peace", // 14
			"St Raymond of Peñafort, Confessor; St Emerentiana", // 15
			"Conversion of St Paul", // 16
			"St Polycarp, Bishop & Martyr", // 17
			"St John Chrysostom, Bishop, Confessor & Doctor", // 18
			"St Peter Nolasco, Confessor; St Agnes", // 19
			"St Francis de Sales, Bishop, Confessor & Doctor", // 20
			"St Martina, Virgin & Martyr" // 21
	};

	final private String[] february = { "St Ignatius of Antioch, Bishop & Martyr", // 0
			"CANDLEMAS, Purification of the Blessed Virgin Mary", // 1
			"St Blaise, Bishop & Martyr", // 2
			"St Andrew Corsini, Bishop & Confessor", // 3
			"St Agatha, Virgin & Martyr", // 4
			"St Titus, Bishop & Confessor; St Dorothy", // 5
			"St John of Matha, Confessor", // 6
			"St Cyril of Alexandria, Bishop, Confessor & Doctor; St Apollonia", // 7
			"St Scholastica, Virgin", // 8
			"Our Lady of Lourdes", // 9
			"Seven Holy Servite Founders, Confessors", // 10
			"Ss Faustinus and Jovita, Martyrs", // 11
			"St Simeon, Bishop & Martyr", // 12
			"Chair of St Peter", // 13
			"St Peter Damian, Bishop & Doctor", // 14
			"St Matthias, Apostle", // 15
			"St Gabriel of Our Lady of Sorrows, Confessor" // 16
	};

	final private String[] march = { "St Casimir of Poland, Confessor; St Lucius I, Pope & Martyr", // 0
			"Ss Perpetua and Felicity, Martyrs", // 1
			"St John of God, Religious; SCHOOLS: St Thomas Aquinas, Confessor & Doctor, Principal Patron", // 2
			"St Frances of Rome, Religious", // 3
			"The Forty Holy Martyrs of Sebaste", // 4
			"St Gregory the Great, Pope and Doctor", // 5
			"St Patrick, Bishop & Confessor", // 6
			"St Cyril of Jerusalem, Bishop, Confessor & Doctor", // 7
			"St Joseph, Spouse of the Blessed Virgin Mary", // 8
			"Gabrielmas, St Gabriel the Archangel", // 9
			"Annunciation of the Blessed Virgin Mary", // 10
			"Seven Sorrows of the Blessed Virgin Mary", // 11
			"St John Damascene, Confessor & Doctor" // 12
	};

	final private String[] april = { "St Hermenegild, Martyr", // 0
			"St Justin, Martyr; Ss Tiburtius, Valerian, and Maximus, Martyrs", // 1
			"St Anicetus, Pope & Martyr", // 2
			"St Anselm, Bishop, Confessor & Doctor", // 3
			"Ss Soter and Caius, Popes & Martyrs", // 4
			"Georgemas, St George, Martyr;", // 5
			"St Fidelis of Sigmaringen, Martyr", // 6
			"Ss Cletus and Marcellinus, Popes & Martyrs", // 7
			"St Peter Canisius, Confessor & Doctor", // 8
			"St Paul of the Cross, Confessor", // 9
			"St Peter of Verona, Martyr", // 10
			"St Catherine of Siena, Virgin & Doctor" // 11
	};

	final private String[] may = { "St Joseph the Workman", // 0
			"Ss Alexander & Companions, Martyrs; Finding of the Holy Cross", // 1
			"St Monica, Widow", // 2
			"St Pius V, Pope & Confessor", // 3
			"St John Before the Latin Gate", // 4
			"St Stanislaus, Bishop & Martyr", // 5
			"Apparition of St Michael; Our Lady, Mediatrix of All Graces", // 6
			"St Antoninus, Bishop & Confessor; Ss Gordian and Epimachus, Martyrs", // 7
			"Ss Philip and James, Apostles", // 8
			"Ss Nereus, Achilleus, Martyrs; Domitilla, Virgin; St Pancras, Martyr", // 9
			"St Boniface of Tarsus, Martyr", // 10
			"St Jean Baptiste de la Salle, Confessor", // 11
			"St Pascal Baylon, Confessor", // 12
			"St Venantius, Martyr", // 13
			"St Peter Celestine, Pope & Confessor; St Prudentiana, Virgin", // 14
			"St Bernardine of Sienna, Confessor", // 15
			"Queenship of Mary" // 16
	};

	final private String[] june = { "St Angela Merici, Virgin", // 0
			"Marcellinus, Peter & Erasmus, Martyrs", // 1
			"St Francis Caracciolo, Confessor", // 2
			"St Boniface, Bishop & Martyr", // 3
			"Ss Primus & Felicianus, Martyrs", // 4
			"St Margaret of Scotland, Queen & Widow", // 5
			"St John of San Fecundo, Confessor; Ss Basilides, Cyrinus, Nabor and Nazarius, Martyrs", // 6
			"St Basil the Great, Bishop, Confessor & Doctor", // 7
			"Ss Vitus, Modestus & Crescentia, Martyrs", // 8
			"St Gregory Barbarigo, Bishop & Confessor", // 9
			"St Ephrem of Syria, Deacon, Confessor & Doctor", // 10
			"Ss Mark and Marcellianus, Martyrs", // 11
			"St Julia Falconieri, Virgin", // 12
			"St Aloysius Gonzaga, Confessor", // 13
			"St Paulinus of Nola, Bishop & Confessor", // 14
			"St John's Eve", // 15
			"Johnmas, Nativity of St John the Baptist", // 16
			"St William, Abbot", // 17
			"Ss John and Paul, Martyrs", // 18
			"Vigil of Ss Peter and Paul", // 19
			"Ss Peter and Paul, Apostles", // 20
			"Commemoration of St Paul, Apostle" // 21
	};

	final private String[] july = { "The Most Precious Blood of Our Lord Jesus Christ", // 0
			"Visitation of the Blessed Virgin Mary; Ss Processus and Martinian, Martyrs", // 1
			"St Irenaeus, Bishop & Martyr", // 2
			"St Anthony Mary Zaccaria, Confessor", // 3
			"St Maria Goretti, Virgin & Martyr", // 4
			"Ss Cyril and Methodius, Bishops & Confessors", // 5
			"St Elizabeth of Portugal, Queen & Widow", // 6
			"St Veronica Giuliani, Virgin", // 7
			"Seven Holy Brothers, Martyrs, and Ss Rufina & Secunda, Virgin Martyrs", // 8
			"St John Gualbert, Abbot; Ss Nabor and Felix, Martyrs", // 9
			"St Bonaventure, Bishop, Confessor & Doctor", // 10
			"St Henry the Emperor, Confessor", // 11
			"Our Lady of Mount Carmel", // 12
			"St Alexis, Confessor", // 13
			"St Vincent de Paul, Confessor", // 14
			"St Jerome Emiliani, Confessor; St Margaret of Antioch, Virgin & Martyr", // 15
			"St Laurence of Brindisi, Confessor & Doctor; St Praxedes, Virgin; St Victor, Martyr", // 16
			"St Mary Magdalene, Penitent", // 17
			"St Apollinaris, Bishop & Martyr; St Liborius, Bishop & Confessor ", // 18
			"St Christina, Virgin & Martyr", // 19
			"St James, Apostle; St Christopher", // 20
			"St Anne, Mother of the Blessed Virgin Mary", // 21
			"St Pantaleon, Martyr", // 22
			"Ss Nazarius and Celsus, Martyrs; St Victor I, Pope & Martyr; St Innocent I, Pope & Confessor", // 23
			"St Martha, Virgin; Ss Felix, Simplicius, Faustinus and Beatrice, Martyrs", // 24
			"Ss Abdon & Sennen, Martyrs", // 25
			"St Ignatius Loyola, Confessor" // 26
	};

	final private String[] august = { "St Alphonsus Liguori, Bishop, Confessor & Doctor; St Stephen I, Pope & Martyr", // 0
			"Finding of the Body of St Stephen, Protomartyr", // 1
			"St Dominic, Confessor", // 2
			"Dedication of St Mary of the Snows", // 3
			"The Transfiguration of Our Lord; St Sixtus II, Pope, Felicissimus and Agapitus, Martyrs", // 4
			"St Cajetan, Confessor; St Donatus, Bishop & Martyr", // 5
			"Vigil of St Laurence; St Romanus, Martyr", // 6
			"St Laurence, Deacon & Martyr", // 7
			"Ss Tiburtius, Martyr, and St Susanna, Virgin Martyr", // 8
			"St Clare, Virgin", // 9
			"Ss Hippolytus and Cassian, Martyrs", // 10
			"The Assumption of the Blessed Virgin Mary", // 11
			"St Joachim, Father of the Blessed Virgin Mary", // 12
			"St Hyacinth, Confessor", // 13
			"St Agapitus, Martyr", // 14
			"St John Eudes, Confessor", // 15
			"St Bernard of Clairvaux, Abbot & Doctor", // 16
			"St Jane Frances de Chantal, Widow", // 17
			"St Philip Benize, Confessor", // 18
			"St Bartholomew, Apostle", // 19
			"St Louis IX, King & Confessor", // 20
			"St Zephyrinus, Pope & Martyr", // 21
			"St Joseph Calasance, Confessor", // 22
			"St Augustine, Bishop, Confessor & Doctor; St Hermes, Martyr", // 23
			"Beheading of St John the Baptist; St Sabina, Martyr", // 24
			"St Rose of Lima, Virgin; Ss Felix and Adauctus, Martyrs", // 25
			"St Raymond Nonnatus, Confessor", // 26
	};

	final private String[] september = { "St Giles, Confessor; Twelve Holy Brothers, Martyrs", // 0
			"St Stephen of Hungary, King & Confessor", // 1
			"St Pius X, Pope & Confessor", // 2
			"Marymas, Nativity of the Blessed Virgin Mary; St Adrian, Martyr", // 3
			"St Gorgonius, Martyr; USA: St Peter Claver, Confessor", // 4
			"St Nicholas of Tolentino, Confessor", // 5
			"Ss Protus and Hyacinth, Martyrs", // 6
			"Exaltation of the Holy Cross", // 7
			"Seven Sorrows of The Blessed Virgin Mary; St Nicomedes, Martyr", // 8
			"Ss Cornelius, Pope, and Cyprian, Martyrs; Sts. Euphemia, Lucy and Geminanus, Martyrs; St Ninian, Bishop; Bl. Victor III, Pope", // 9
			"Stigmata of St Francis", // 10
			"St Joseph of Cupertino, Confessor", // 11
			"Ss Eustache & Companions, Martyrs", // 12
			"St Matthew, Apostle & Evangelist", // 13
			"St Thomas of Villanova, Bishop & Confessor", // 14
			"St Linus, Pope & Martyr; St Thecla, Virgin and Martyr", // 15
			"Our Lady of Ransom", // 16
			"Ss Cosmas and Damian, Martyrs", // 17
			"St Wenceslaus, Duke & Martyr", // 18
			"Michaelmas, Dedication of the Basilica of St Michael the Archangel", // 19
			"St Jerome, Priest, Confessor & Doctor", // 20
	};

	final private String[] october = { "St Remigius, Bishop & Confessor", // 0
			"Holy Guardian Angels", // 1
			"MISSIONS: St Theresa of the Infant Jesus, Virgin, Principal Patroness", // 2
			"St Francis of Assisi, Confessor", // 3
			"St Placid and Companions, Martyrs", // 4
			"St Bruno, Confessor", // 5
			"Our Lady of the Most Holy Rosary; St Mark, Pope & Confessor", // 6
			"St Bridget of Sweden, Widow; Ss Sergius, Bacchus, Marcellus and Apuleius", // 7
			"St John Leonardi, Confessor; Saints Denis, Rusticus and Eleutherius, Martyrs", // 8
			"The Maternity of the Blessed Virgin Mary", // 9
			"St Edward the Confessor, King", // 10
			"St Calistus I, Pope & Martyr", // 11
			"St Teresa of Avila, Virgin & Doctor", // 12
			"St Hedwig, Widow; CANADA: St Marguerite d’Youville, Widow", // 13
			"St Luke, Evangelist", // 14
			"St Peter of Alcantara, Confessor", // 15
			"St John Cantius, Confessor", // 16
			"St Hilarion, Abbot; Ss Ursula and Companions, Virgins & Martyrs", // 17
			"St Anthony Mary Claret, Bishop & Confessor", // 18
			"Ss Chrysanthus and Daria, Martyrs", // 19
			"St Evaristus, Pope & Martyr", // 20
			"Ss Simon and Jude, Apostles", // 21
			"Halloween, Vigil of All Hallow's Day, Vigil of All Saints" };

	final private String[] november = { "Hallowmas, All Hallows, All Saints", // 0
			"Soulmas, All Souls", // 1
			"SEMINARIES: St Charles Borromeo, Bishop & Confessor; Ss Vitalis and Agricola, Martyrs", // 2
			"The Holy Relics", // 3
			"Four Holy Crowned Martyrs", // 4
			"Dedication of the Archbasilica of Our Holy Savior (St John Lateran); St Theodore, Martyr", // 5
			"St Andrew Avellino, Confessor; SsTryphon, Respicius and Nympha, Virgins & Martyrs", // 6
			"Martinmas, St Martin of Tours, Bishop & Confessor; St Mennas, Martyr", // 7
			"St Martin I, Pope & Martyr", // 8
			"St Didacus, Confessor; USA: St Frances Xavier Cabrini, Virgin", // 9
			"St Albert the Great, Bishop, Confessor & Doctor", // 10
			"St Gertrude the Great, Virgin", // 11
			"St Gregory the Wonderworker, Bishop & Confessor", // 12
			"Dedication of the Basilicas of Ss Peter and Paul", // 13
			"St Elizabeth of Hungary, Widow; St Pontianus, Pope & Martyr", // 14
			"St Felix of Valois, Confessor", // 15
			"St Cecilia, Virgin & Martyr", // 16
			"St Clement I, Pope & Martyr; St Felicitas, Martyr", // 17
			"St John of the Cross, Confessor & Doctor; St Chrysogonus, Martyr", // 18
			"St Catherine of Alexandria, Virgin & Martyr", // 19
			"St Sylvester, Abbot; St Peter of Alexandria, Bishop & Martyr", // 20
			"Our Lady of the Miraculous Medal", // 21
			"St Saturninus, Martyr", // 22
			"Andermas, St Andrew, Apostle", // 23
	};

	final private String[] december = { "St Bibiana, Virgin & Martyr", // 0
			"St Francis Xavier, Confessor", // 1
			"St Peter Chrysologus, Bishop, Confessor & Doctor; St Barbara, Virgin & Martyr", // 2
			"St Sabbas, Abbot", // 3
			"St Ambrose, Bishop, Confessor & Doctor", // 4
			"Immaculate Conception of the Blessed Virgin Mary", // 5
			"St Melchiades, Pope & Martyr", // 6
			"St Damasus I, Pope & Confessor", // 7
			"USA: Our Lady of Guadalupe", // 8
			"St Eusebius, Bishop & Martyr", // 9
			"St Thomas, Apostle", // 10
			"Christmas Eve, Vigil of the Nativity of Our Lord", // 11
			"CHRISTMAS, the Nativity of Our Lord", // 12
			"St Stephen, Deacon & Protomartyr", // 13
			"St John the Evangelist, Apostle", // 14
			"Holy Innocents, Martyrs", // 15
			"St Thomas Becket, Martyr", // 16
			"St Sylvester I" // 17
	};

	private String checkMovable(Calendar calendar, String feast) {

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);

		int easter = getEaster(year).get(Calendar.DAY_OF_YEAR);

		int pentecost = easter + (7 * 7);
		int septuagesima = easter - (7 * 9);
		int epiphany = new GregorianCalendar(year, 0, 6).get(Calendar.DAY_OF_YEAR);

		Calendar epiphanyDate = new GregorianCalendar(year, 0, 6);

		int sundayAfterEpiphany = 0;

		Boolean foundSunday = false;
		do {
			epiphanyDate.add(Calendar.DAY_OF_YEAR, 1);
			if (epiphanyDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundayAfterEpiphany = epiphanyDate.get(Calendar.DAY_OF_YEAR);
				foundSunday = true;
			}
		} while (!foundSunday);

		int christmas = new GregorianCalendar(year, 11, 25).get(Calendar.DAY_OF_YEAR);
		int advent = getAdvent(year).get(Calendar.DAY_OF_YEAR);

		if (month == monthPopeElected && dayOfMonth == dayPopeElected && year >= yearPopeElected) {
			String anniversaryYear = "";

			if (year - yearPopeElected == 1)
				anniversaryYear = (year - yearPopeElected) + " Year Anniversary of the ";
			if (year - yearPopeElected > 1)
				anniversaryYear = (year - yearPopeElected) + " Years Anniversary of the ";
			if (!feast.equals("Feria"))
				feast = anniversaryYear + "Election of His Holiness, Pope " + popeName + ", Bishop of Rome; " + feast;
			else
				feast = anniversaryYear + "Election of His Holiness, Pope " + popeName + ", Bishop of Rome";
		}

		if (dayOfWeek == Calendar.SUNDAY)
			feast = "Sunday of Our Lord";
		else if (dayOfWeek == Calendar.SATURDAY)
			feast = "Saturday of Our Lady";

		// ADVENT
		if (dayOfYear >= advent && dayOfYear < christmas) {
			if (dayOfYear == advent)
				feast = "1st Sunday of Advent";
			else if (dayOfYear == advent + 7)
				feast = "2nd Sunday of Advent";
			else if (dayOfYear == advent + (7 * 2))
				feast = "3rd Sunday of Advent";
			else if (dayOfYear == advent + (7 * 3))
				feast = "4th Sunday of Advent";
			else if (feast.equals("Feria"))
				feast += " of Advent";
		}

		// CHRISTMASTIDE
		if (dayOfYear >= christmas || dayOfYear < epiphany) {
			if (feast.equals("Feria") || dayOfWeek == Calendar.SUNDAY)
				feast += " in Christmastide";
		}

		// EPIPHANYTIDE
		if (dayOfYear > epiphany && dayOfYear < septuagesima) {
			if (dayOfYear == sundayAfterEpiphany)
				feast = "The Holy Family";
			else if (dayOfYear == sundayAfterEpiphany + 7)
				feast = "2nd Sunday after Epiphany";
			else if (dayOfYear == sundayAfterEpiphany + (7 * 2))
				feast = "3rd Sunday after Epiphany";

			else if (feast.equals("Feria") && dayOfYear > epiphany && dayOfYear < sundayAfterEpiphany)
				feast += " after Epiphany";
			else if (feast.equals("Feria") && dayOfYear >= sundayAfterEpiphany + 1
					&& dayOfYear < sundayAfterEpiphany + 7)
				feast += " of the 1st Sunday after Epiphany";
			else if (feast.equals("Feria") && dayOfYear >= sundayAfterEpiphany + 7
					&& dayOfYear < sundayAfterEpiphany + (7 * 2))
				feast += " of the 2nd Sunday after Epiphany";
			else if (feast.equals("Feria") && dayOfYear >= sundayAfterEpiphany + (7 * 2)
					&& dayOfYear < sundayAfterEpiphany + (7 * 3))
				feast += " of the 3rd Sunday after Epiphany";
		}

		// SHROVETIDE
		if (dayOfYear < easter - (7 * 6) - 4 && dayOfYear >= septuagesima) {
			if (dayOfYear == septuagesima)
				feast = "SEPTUAGESIMA Sunday";
			else if (dayOfYear == easter - (7 * 8))
				feast = "Sexagesima Sunday";
			else if (dayOfYear == easter - (7 * 7))
				feast = "Quinquagesima Sunday";

			else if (feast.equals("Feria"))
				feast += " in Shrovetide";
		}

		// LENT
		if (dayOfYear < easter && dayOfYear >= easter - (7 * 6) - 4) {

			if (dayOfYear == easter - (7 * 6) - 4)
				feast = "ASH Wednesday";
			else if (dayOfYear == easter - (7 * 6) - 3 && !feast.equals("Feria"))
				feast = "Thursday after Ash Wednesday; " + feast;
			else if (dayOfYear == easter - (7 * 6) - 3 && feast.equals("Feria"))
				feast = "Thursday after Ash Wednesday";
			else if (dayOfYear == easter - (7 * 6) - 2)
				feast = "The Crown of Thorns";
			else if (dayOfYear == easter - (7 * 6) - 1 && !feast.equals("Feria"))
				feast = "Saturday after Ash Wednesday; " + feast;
			else if (dayOfYear == easter - (7 * 6) - 1 && feast.equals("Feria"))
				feast = "Saturday after Ash Wednesday";
			else if (dayOfYear == easter - (7 * 6))
				feast = "1st Sunday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 3 && !feast.equals("Feria"))
				feast += "; Ember Wednesday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 3 && feast.equals("Feria"))
				feast = "Ember Wednesday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 5 && !feast.equals("Feria"))
				feast += "; Ember Friday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 5 && feast.equals("Feria"))
				feast = "Ember Friday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 6 && !feast.equals("Feria"))
				feast += "; Ember Saturday of Lent";
			else if (dayOfYear == easter - (7 * 6) + 6 && feast.equals("Feria"))
				feast = "Ember Saturday of Lent";
			else if (dayOfYear == easter - (7 * 5))
				feast = "2nd Sunday of Lent";
			else if (dayOfYear == easter - (7 * 4))
				feast = "3rd Sunday of Lent";
			else if (dayOfYear == easter - (7 * 3))
				feast = "Laetare Sunday, 4th Sunday of Lent";
			else if (dayOfYear == easter - (7 * 2)) // PASSIONTIDE
				feast = "1st Sunday of Passiontide";
			else if (dayOfYear == easter - 7) // HOLY WEEK
				feast = "Palm Sunday, 2nd Sunday of Passiontide";
			else if (dayOfYear == easter - 6)
				feast = "Holy Monday";
			else if (dayOfYear == easter - 5)
				feast = "Holy Tuesday";
			else if (dayOfYear == easter - 4)
				feast = "Spy Wednesday, Holy Wednesday";
			else if (dayOfYear == easter - 3)
				feast = "Maundry Thursday, Holy Thursday";
			else if (dayOfYear == easter - 2)
				feast = "Good Friday";
			else if (dayOfYear == easter - 1)
				feast = "Holy Saturday";

			else if (feast.equals("Feria") && dayOfYear < easter - (7 * 2) && dayOfYear > easter - 46)
				feast += " of Lent";
			else if (feast.equals("Feria") && dayOfYear > easter - (7 * 2))
				feast += " of Passiontide";
		}

		// PASCHALTIDE
		if (dayOfYear >= easter && dayOfYear < pentecost) {
			if (dayOfYear == easter)
				feast = "EASTER Sunday";
			else if (dayOfYear == easter + 1)
				feast = "Easter Monday";
			else if (dayOfYear == easter + 2)
				feast = "Easter Tuesday";
			else if (dayOfYear == easter + 3)
				feast = "Easter Wednesday";
			else if (dayOfYear == easter + 4)
				feast = "Easter Thursday";
			else if (dayOfYear == easter + 5)
				feast = "Easter Friday";
			else if (dayOfYear == easter + 6)
				feast = "Easter Saturday";
			else if (dayOfYear == easter + 7)
				feast = "Divine Mercy Sunday";
			else if (dayOfYear == easter + (7 * 2))
				feast = "Good Shepherd Sunday";
			else if (dayOfYear == easter + (7 * 3))
				feast = "3rd Sunday after Easter";
			else if (dayOfYear == easter + (7 * 4))
				feast = "4th Sunday after Easter";
			else if (dayOfYear == easter + (7 * 5))
				feast = "5th Sunday after Easter";
			else if (dayOfYear == easter + (7 * 5) + 5) // ASCENSIONTIDE
				feast = "The Ascension of the Lord";
			else if (dayOfYear == easter + (7 * 6))
				feast = "Sunday after the Ascension";

			else if (feast.equals("Feria") && dayOfYear > easter && dayOfYear < easter + (7 * 5) + 5)
				feast += " in Paschaltide";
			else if (feast.equals("Feria") && dayOfYear > easter + (7 * 5) + 5)
				feast += " after Ascension";
		}

		// ORDINARY TIME
		if (dayOfYear >= pentecost && dayOfYear < advent) {
			if (dayOfYear == pentecost)
				feast = "PENTECOST, Whitsun";
			else if (dayOfYear == pentecost + 1)
				feast = "Pentecost Monday";
			else if (dayOfYear == pentecost + 2)
				feast = "Pentecost Tuesday";
			else if (dayOfYear == pentecost + 3)
				feast = "Ember Wednesday of Pentecost";
			else if (dayOfYear == pentecost + 4)
				feast = "Pentecost Thursday";
			else if (dayOfYear == pentecost + 5)
				feast = "Ember Friday of Pentecost";
			else if (dayOfYear == pentecost + 6)
				feast = "Ember Saturday of Pentecost";
			else if (dayOfYear == pentecost + 7)
				feast = "Trinity Sunday";
			else if (dayOfYear == pentecost + 7 + 4)
				feast = "Corpus Christi";
			else if (dayOfYear == pentecost + (7 * 2))
				feast = "2nd Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 2) + 5)
				feast = "The Most Sacred Heart of Jesus";
			else if (dayOfYear == pentecost + (7 * 3))
				feast = "3rd Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 4))
				feast = "4th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 5))
				feast = "5th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 6))
				feast = "6th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 7))
				feast = "7th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 8))
				feast = "8th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 9))
				feast = "9th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 10))
				feast = "10th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 11))
				feast = "11th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 12))
				feast = "12th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 13))
				feast = "13th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 14))
				feast = "14th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 15))
				feast = "15th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 16))
				feast = "16th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 17))
				feast = "17th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 18))
				feast = "18th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 19))
				feast = "19th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 20))
				feast = "20th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 21))
				feast = "21th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 22))
				feast = "22th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 23))
				feast = "23th Sunday after Pentecost";
			else if (dayOfYear == pentecost + (7 * 24))
				feast = "24th Sunday after Pentecost";
			else if (feast.equals("Feria"))
				feast += " after Pentecost";
		}

		return feast;
	}

	// Credits:
	// https://www.codeproject.com/Articles/10860/Calculating-Christian-Holidays
	private Calendar getAdvent(int year) {
		int weeks = 4;
		int correction = 0;
		Calendar christmasToAdvent = new GregorianCalendar(year, 11, 25);

		if (christmasToAdvent.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			weeks--;
			correction = (christmasToAdvent.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY);
		}
		christmasToAdvent.add(Calendar.DAY_OF_YEAR, (-1 * ((weeks * 7) + correction)));
		return christmasToAdvent;

	}

	/**
	 * @author: Ian F. Darwin, http://www.darwinsys.com/, based on a detailed
	 *          algorithm in Knuth, vol 1, pg 155.
	 * 
	 * @Version: $Id: Easter.java,v 1.5 2004/02/09 03:33:46 ian Exp $ Written in C,
	 *           Toronto, 1988. Java version 1996. Compute the day of the year that
	 *           Easter falls on. Step names E1 E2 etc., are direct references to
	 *           Knuth, Vol 1, p 155. @exception IllegalArgumentexception If the
	 *           year is before 1582 (since the algorithm only works on the
	 *           Gregorian calendar).
	 */
	private Calendar getEaster(int year) {
		if (year <= 1582) {
			throw new IllegalArgumentException("Algorithm invalid before April 1583");
		}
		int golden, century, x, z, d, epact, n;

		golden = (year % 19) + 1; /* E1: metonic cycle */
		century = (year / 100) + 1; /* E2: e.g. 1984 was in 20th C */
		x = (3 * century / 4) - 12; /* E3: leap year correction */
		z = ((8 * century + 5) / 25) - 5; /* E3: sync with moon's orbit */
		d = (5 * year / 4) - x - 10;
		epact = (11 * golden + 20 + z - x) % 30; /* E5: epact */
		if ((epact == 25 && golden > 11) || epact == 24)
			epact++;
		n = 44 - epact;
		n += 30 * (n < 21 ? 1 : 0); /* E6: */
		n += 7 - ((d + n) % 7);
		if (n > 31) /* E7: */
			return new GregorianCalendar(year, 4 - 1, n - 31); /* April */
		else
			return new GregorianCalendar(year, 3 - 1, n); /* March */
	}

	public String getFeast(Calendar calendar) {
		String feast = "Feria";
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		switch (month) {
		case 0: // JANUARY
			if (day == 1)
				feast = checkMovable(calendar, this.january[0]);
			else if (day == 2)
				feast = checkMovable(calendar, feast);
			else if (day == 3)
				feast = checkMovable(calendar, this.january[1]);
			else if (day == 4)
				feast = checkMovable(calendar, this.january[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.january[3]);
			else if (day == 6)
				feast = checkMovable(calendar, this.january[4]);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, feast);
			else if (day == 9)
				feast = checkMovable(calendar, feast);
			else if (day == 10)
				feast = checkMovable(calendar, feast);
			else if (day == 11)
				feast = checkMovable(calendar, this.january[5]);
			else if (day == 12)
				feast = checkMovable(calendar, feast);
			else if (day == 13)
				feast = checkMovable(calendar, this.january[6]);
			else if (day == 14)
				feast = checkMovable(calendar, this.january[7]);
			else if (day == 15)
				feast = checkMovable(calendar, this.january[8]);
			else if (day == 16)
				feast = checkMovable(calendar, this.january[9]);
			else if (day == 17)
				feast = checkMovable(calendar, feast);
			else if (day == 18)
				feast = checkMovable(calendar, this.january[10]);
			else if (day == 19)
				feast = checkMovable(calendar, this.january[11]);
			else if (day == 20)
				feast = checkMovable(calendar, this.january[12]);
			else if (day == 21)
				feast = checkMovable(calendar, this.january[13]);
			else if (day == 22)
				feast = checkMovable(calendar, this.january[14]);
			else if (day == 23)
				feast = checkMovable(calendar, this.january[15]);
			else if (day == 24)
				feast = checkMovable(calendar, feast);
			else if (day == 25)
				feast = checkMovable(calendar, this.january[16]);
			else if (day == 26)
				feast = checkMovable(calendar, this.january[17]);
			else if (day == 27)
				feast = checkMovable(calendar, this.january[18]);
			else if (day == 28)
				feast = checkMovable(calendar, this.january[19]);
			else if (day == 29)
				feast = checkMovable(calendar, this.january[20]);
			else if (day == 30)
				feast = checkMovable(calendar, this.january[21]);
			else if (day == 31)
				feast = checkMovable(calendar, feast);

			break;
		case 1: // FEBRUARY
			if (day == 1)
				feast = checkMovable(calendar, this.february[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.february[1]);
			else if (day == 3)
				feast = checkMovable(calendar, this.february[2]);
			else if (day == 4)
				feast = checkMovable(calendar, this.february[3]);
			else if (day == 5)
				feast = checkMovable(calendar, this.february[4]);
			else if (day == 6)
				feast = checkMovable(calendar, this.february[5]);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, this.february[6]);
			else if (day == 9)
				feast = checkMovable(calendar, this.february[7]);
			else if (day == 10)
				feast = checkMovable(calendar, this.february[8]);
			else if (day == 11)
				feast = checkMovable(calendar, this.february[9]);
			else if (day == 12)
				feast = checkMovable(calendar, this.february[10]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, feast);
			else if (day == 15)
				feast = checkMovable(calendar, this.february[11]);
			else if (day == 16)
				feast = checkMovable(calendar, feast);
			else if (day == 17)
				feast = checkMovable(calendar, feast);
			else if (day == 18)
				feast = checkMovable(calendar, this.february[12]);
			else if (day == 19)
				feast = checkMovable(calendar, feast);
			else if (day == 20)
				feast = checkMovable(calendar, feast);
			else if (day == 21)
				feast = checkMovable(calendar, feast);
			else if (day == 22)
				feast = checkMovable(calendar, this.february[13]);
			else if (day == 23)
				feast = checkMovable(calendar, this.february[14]);
			else if (day == 24)
				feast = checkMovable(calendar, this.february[15]);
			else if (day == 25)
				feast = checkMovable(calendar, feast);
			else if (day == 26)
				feast = checkMovable(calendar, feast);
			else if (day == 27)
				feast = checkMovable(calendar, this.february[16]);
			else if (day == 28)
				feast = checkMovable(calendar, feast);
			else if (day == 29)
				feast = checkMovable(calendar, feast);

			break;
		case 2: // MARCH
			if (day == 1)
				feast = checkMovable(calendar, feast);
			else if (day == 2)
				feast = checkMovable(calendar, feast);
			else if (day == 3)
				feast = checkMovable(calendar, feast);
			else if (day == 4)
				feast = checkMovable(calendar, this.march[0]);
			else if (day == 5)
				feast = checkMovable(calendar, feast);
			else if (day == 6)
				feast = checkMovable(calendar, this.march[1]);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, this.march[2]);
			else if (day == 9)
				feast = checkMovable(calendar, this.march[3]);
			else if (day == 10)
				feast = checkMovable(calendar, this.march[4]);
			else if (day == 11)
				feast = checkMovable(calendar, feast);
			else if (day == 12)
				feast = checkMovable(calendar, this.march[5]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, feast);
			else if (day == 15)
				feast = checkMovable(calendar, feast);
			else if (day == 16)
				feast = checkMovable(calendar, feast);
			else if (day == 17)
				feast = checkMovable(calendar, this.march[6]);
			else if (day == 18)
				feast = checkMovable(calendar, this.march[7]);
			else if (day == 19)
				feast = checkMovable(calendar, this.march[8]);
			else if (day == 20)
				feast = checkMovable(calendar, feast);
			else if (day == 21)
				feast = checkMovable(calendar, feast);
			else if (day == 22)
				feast = checkMovable(calendar, feast);
			else if (day == 23)
				feast = checkMovable(calendar, feast);
			else if (day == 24)
				feast = checkMovable(calendar, this.march[9]);
			else if (day == 25)
				feast = checkMovable(calendar, this.march[10]);
			else if (day == 26)
				feast = checkMovable(calendar, this.march[11]);
			else if (day == 27)
				feast = checkMovable(calendar, this.march[12]);
			else if (day == 28)
				feast = checkMovable(calendar, feast);
			else if (day == 29)
				feast = checkMovable(calendar, feast);
			else if (day == 30)
				feast = checkMovable(calendar, feast);
			else if (day == 31)
				feast = checkMovable(calendar, feast);

			break;
		case 3: // APRIL
			if (day == 1)
				feast = checkMovable(calendar, feast);
			else if (day == 2)
				feast = checkMovable(calendar, feast);
			else if (day == 3)
				feast = checkMovable(calendar, feast);
			else if (day == 4)
				feast = checkMovable(calendar, feast);
			else if (day == 5)
				feast = checkMovable(calendar, feast);
			else if (day == 6)
				feast = checkMovable(calendar, feast);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, feast);
			else if (day == 9)
				feast = checkMovable(calendar, feast);
			else if (day == 10)
				feast = checkMovable(calendar, feast);
			else if (day == 11)
				feast = checkMovable(calendar, feast);
			else if (day == 12)
				feast = checkMovable(calendar, feast);
			else if (day == 13)
				feast = checkMovable(calendar, this.april[0]);
			else if (day == 14)
				feast = checkMovable(calendar, this.april[1]);
			else if (day == 15)
				feast = checkMovable(calendar, feast);
			else if (day == 16)
				feast = checkMovable(calendar, feast);
			else if (day == 17)
				feast = checkMovable(calendar, this.april[2]);
			else if (day == 18)
				feast = checkMovable(calendar, feast);
			else if (day == 19)
				feast = checkMovable(calendar, feast);
			else if (day == 20)
				feast = checkMovable(calendar, feast);
			else if (day == 21)
				feast = checkMovable(calendar, this.april[3]);
			else if (day == 22)
				feast = checkMovable(calendar, this.april[4]);
			else if (day == 23)
				feast = checkMovable(calendar, this.april[5]);
			else if (day == 24)
				feast = checkMovable(calendar, this.april[6]);
			else if (day == 25)
				feast = checkMovable(calendar, feast);
			else if (day == 26)
				feast = checkMovable(calendar, this.april[7]);
			else if (day == 27)
				feast = checkMovable(calendar, this.april[8]);
			else if (day == 28)
				feast = checkMovable(calendar, this.april[9]);
			else if (day == 29)
				feast = checkMovable(calendar, this.april[10]);
			else if (day == 30)
				feast = checkMovable(calendar, this.april[11]);

			break;
		case 4: // MAY
			if (day == 1)
				feast = checkMovable(calendar, this.may[0]);
			else if (day == 2)
				feast = checkMovable(calendar, feast);
			else if (day == 3)
				feast = checkMovable(calendar, this.may[1]);
			else if (day == 4)
				feast = checkMovable(calendar, this.may[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.may[3]);
			else if (day == 6)
				feast = checkMovable(calendar, this.may[4]);
			else if (day == 7)
				feast = checkMovable(calendar, this.may[5]);
			else if (day == 8)
				feast = checkMovable(calendar, this.may[6]);
			else if (day == 9)
				feast = checkMovable(calendar, feast);
			else if (day == 10)
				feast = checkMovable(calendar, this.may[7]);
			else if (day == 11)
				feast = checkMovable(calendar, this.may[8]);
			else if (day == 12)
				feast = checkMovable(calendar, this.may[9]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, this.may[10]);
			else if (day == 15)
				feast = checkMovable(calendar, this.may[11]);
			else if (day == 16)
				feast = checkMovable(calendar, feast);
			else if (day == 17)
				feast = checkMovable(calendar, this.may[12]);
			else if (day == 18)
				feast = checkMovable(calendar, this.may[13]);
			else if (day == 19)
				feast = checkMovable(calendar, this.may[14]);
			else if (day == 20)
				feast = checkMovable(calendar, this.may[15]);
			else if (day == 21)
				feast = checkMovable(calendar, feast);
			else if (day == 22)
				feast = checkMovable(calendar, feast);
			else if (day == 23)
				feast = checkMovable(calendar, feast);
			else if (day == 24)
				feast = checkMovable(calendar, feast);
			else if (day == 25)
				feast = checkMovable(calendar, feast);
			else if (day == 26)
				feast = checkMovable(calendar, feast);
			else if (day == 27)
				feast = checkMovable(calendar, feast);
			else if (day == 28)
				feast = checkMovable(calendar, feast);
			else if (day == 29)
				feast = checkMovable(calendar, feast);
			else if (day == 30)
				feast = checkMovable(calendar, feast);
			else if (day == 31)
				feast = checkMovable(calendar, this.may[16]);

			break;
		case 5: // JUNE
			if (day == 1)
				feast = checkMovable(calendar, this.june[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.june[1]);
			else if (day == 3)
				feast = checkMovable(calendar, feast);
			else if (day == 4)
				feast = checkMovable(calendar, this.june[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.june[3]);
			else if (day == 6)
				feast = checkMovable(calendar, feast);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, feast);
			else if (day == 9)
				feast = checkMovable(calendar, this.june[4]);
			else if (day == 10)
				feast = checkMovable(calendar, this.june[5]);
			else if (day == 11)
				feast = checkMovable(calendar, feast);
			else if (day == 12)
				feast = checkMovable(calendar, this.june[6]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, this.june[7]);
			else if (day == 15)
				feast = checkMovable(calendar, this.june[8]);
			else if (day == 16)
				feast = checkMovable(calendar, feast);
			else if (day == 17)
				feast = checkMovable(calendar, this.june[9]);
			else if (day == 18)
				feast = checkMovable(calendar, this.june[10]);
			else if (day == 19)
				feast = checkMovable(calendar, this.june[11]);
			else if (day == 20)
				feast = checkMovable(calendar, feast);
			else if (day == 21)
				feast = checkMovable(calendar, this.june[12]);
			else if (day == 22)
				feast = checkMovable(calendar, this.june[13]);
			else if (day == 23)
				feast = checkMovable(calendar, this.june[14]);
			else if (day == 24)
				feast = checkMovable(calendar, this.june[15]);
			else if (day == 25)
				feast = checkMovable(calendar, this.june[16]);
			else if (day == 26)
				feast = checkMovable(calendar, this.june[17]);
			else if (day == 27)
				feast = checkMovable(calendar, feast);
			else if (day == 28)
				feast = checkMovable(calendar, this.june[18]);
			else if (day == 29)
				feast = checkMovable(calendar, this.june[19]);
			else if (day == 30)
				feast = checkMovable(calendar, this.june[20]);

			break;
		case 6: // JULY
			if (day == 1)
				feast = checkMovable(calendar, this.july[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.july[1]);
			else if (day == 3)
				feast = checkMovable(calendar, this.july[2]);
			else if (day == 4)
				feast = checkMovable(calendar, feast);
			else if (day == 5)
				feast = checkMovable(calendar, this.july[3]);
			else if (day == 6)
				feast = checkMovable(calendar, this.july[4]);
			else if (day == 7)
				feast = checkMovable(calendar, this.july[5]);
			else if (day == 8)
				feast = checkMovable(calendar, this.july[6]);
			else if (day == 9)
				feast = checkMovable(calendar, this.july[7]);
			else if (day == 10)
				feast = checkMovable(calendar, this.july[8]);
			else if (day == 11)
				feast = checkMovable(calendar, feast);
			else if (day == 12)
				feast = checkMovable(calendar, this.july[9]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, this.july[10]);
			else if (day == 15)
				feast = checkMovable(calendar, this.july[11]);
			else if (day == 16)
				feast = checkMovable(calendar, this.july[12]);
			else if (day == 17)
				feast = checkMovable(calendar, this.july[13]);
			else if (day == 18)
				feast = checkMovable(calendar, feast);
			else if (day == 19)
				feast = checkMovable(calendar, this.july[14]);
			else if (day == 20)
				feast = checkMovable(calendar, this.july[15]);
			else if (day == 21)
				feast = checkMovable(calendar, this.july[16]);
			else if (day == 22)
				feast = checkMovable(calendar, this.july[17]);
			else if (day == 23)
				feast = checkMovable(calendar, this.july[18]);
			else if (day == 24)
				feast = checkMovable(calendar, this.july[19]);
			else if (day == 25)
				feast = checkMovable(calendar, this.july[20]);
			else if (day == 26)
				feast = checkMovable(calendar, this.july[21]);
			else if (day == 27)
				feast = checkMovable(calendar, this.july[22]);
			else if (day == 28)
				feast = checkMovable(calendar, this.july[23]);
			else if (day == 29)
				feast = checkMovable(calendar, this.july[24]);
			else if (day == 30)
				feast = checkMovable(calendar, this.july[25]);
			else if (day == 31)
				feast = checkMovable(calendar, this.july[26]);

			break;
		case 7: // AUGUST
			if (day == 1)
				feast = checkMovable(calendar, feast);
			else if (day == 2)
				feast = checkMovable(calendar, this.august[0]);
			else if (day == 3)
				feast = checkMovable(calendar, this.august[1]);
			else if (day == 4)
				feast = checkMovable(calendar, this.august[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.august[3]);
			else if (day == 6)
				feast = checkMovable(calendar, this.august[4]);
			else if (day == 7)
				feast = checkMovable(calendar, this.august[5]);
			else if (day == 8)
				feast = checkMovable(calendar, feast);
			else if (day == 9)
				feast = checkMovable(calendar, this.august[6]);
			else if (day == 10)
				feast = checkMovable(calendar, this.august[7]);
			else if (day == 11)
				feast = checkMovable(calendar, this.august[8]);
			else if (day == 12)
				feast = checkMovable(calendar, this.august[9]);
			else if (day == 13)
				feast = checkMovable(calendar, this.august[10]);
			else if (day == 14)
				feast = checkMovable(calendar, this.august[11]);
			else if (day == 15)
				feast = checkMovable(calendar, this.august[12]);
			else if (day == 16)
				feast = checkMovable(calendar, this.august[13]);
			else if (day == 17)
				feast = checkMovable(calendar, this.august[14]);
			else if (day == 18)
				feast = checkMovable(calendar, this.august[15]);
			else if (day == 19)
				feast = checkMovable(calendar, this.august[16]);
			else if (day == 20)
				feast = checkMovable(calendar, this.august[17]);
			else if (day == 21)
				feast = checkMovable(calendar, this.august[18]);
			else if (day == 22)
				feast = checkMovable(calendar, feast);
			else if (day == 23)
				feast = checkMovable(calendar, this.august[19]);
			else if (day == 24)
				feast = checkMovable(calendar, this.august[20]);
			else if (day == 25)
				feast = checkMovable(calendar, this.august[21]);
			else if (day == 26)
				feast = checkMovable(calendar, this.august[22]);
			else if (day == 27)
				feast = checkMovable(calendar, this.august[23]);
			else if (day == 28)
				feast = checkMovable(calendar, this.august[24]);
			else if (day == 29)
				feast = checkMovable(calendar, feast);
			else if (day == 30)
				feast = checkMovable(calendar, this.august[25]);
			else if (day == 31)
				feast = checkMovable(calendar, this.august[26]);

			break;
		case 8: // SEPTEMBER
			if (day == 1)
				feast = checkMovable(calendar, this.september[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.september[1]);
			else if (day == 3)
				feast = checkMovable(calendar, this.september[2]);
			else if (day == 4)
				feast = checkMovable(calendar, feast);
			else if (day == 5)
				feast = checkMovable(calendar, feast);
			else if (day == 6)
				feast = checkMovable(calendar, feast);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, this.september[3]);
			else if (day == 9)
				feast = checkMovable(calendar, this.september[4]);
			else if (day == 10)
				feast = checkMovable(calendar, this.september[5]);
			else if (day == 11)
				feast = checkMovable(calendar, this.september[6]);
			else if (day == 12)
				feast = checkMovable(calendar, feast);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, this.september[7]);
			else if (day == 15)
				feast = checkMovable(calendar, this.september[8]);
			else if (day == 16)
				feast = checkMovable(calendar, this.september[9]);
			else if (day == 17)
				feast = checkMovable(calendar, this.september[10]);
			else if (day == 18)
				feast = checkMovable(calendar, this.september[11]);
			else if (day == 19)
				feast = checkMovable(calendar, feast);
			else if (day == 20)
				feast = checkMovable(calendar, this.september[12]);
			else if (day == 21)
				feast = checkMovable(calendar, this.september[13]);
			else if (day == 22)
				feast = checkMovable(calendar, this.september[14]);
			else if (day == 23)
				feast = checkMovable(calendar, this.september[15]);
			else if (day == 24)
				feast = checkMovable(calendar, this.september[16]);
			else if (day == 25)
				feast = checkMovable(calendar, feast);
			else if (day == 26)
				feast = checkMovable(calendar, feast);
			else if (day == 27)
				feast = checkMovable(calendar, this.september[17]);
			else if (day == 28)
				feast = checkMovable(calendar, this.september[18]);
			else if (day == 29)
				feast = checkMovable(calendar, this.september[19]);
			else if (day == 30)
				feast = checkMovable(calendar, this.september[20]);

			break;
		case 9: // OCTOBER
			if (day == 1)
				feast = checkMovable(calendar, this.october[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.october[1]);
			else if (day == 3)
				feast = checkMovable(calendar, this.october[2]);
			else if (day == 4)
				feast = checkMovable(calendar, this.october[3]);
			else if (day == 5)
				feast = checkMovable(calendar, this.october[4]);
			else if (day == 6)
				feast = checkMovable(calendar, this.october[5]);
			else if (day == 7)
				feast = checkMovable(calendar, this.october[6]);
			else if (day == 8)
				feast = checkMovable(calendar, this.october[7]);
			else if (day == 9)
				feast = checkMovable(calendar, this.october[8]);
			else if (day == 10)
				feast = checkMovable(calendar, feast);
			else if (day == 11)
				feast = checkMovable(calendar, this.october[9]);
			else if (day == 12)
				feast = checkMovable(calendar, feast);
			else if (day == 13)
				feast = checkMovable(calendar, this.october[10]);
			else if (day == 14)
				feast = checkMovable(calendar, this.october[11]);
			else if (day == 15)
				feast = checkMovable(calendar, this.october[12]);
			else if (day == 16)
				feast = checkMovable(calendar, this.october[13]);
			else if (day == 17)
				feast = checkMovable(calendar, feast);
			else if (day == 18)
				feast = checkMovable(calendar, this.october[14]);
			else if (day == 19)
				feast = checkMovable(calendar, this.october[15]);
			else if (day == 20)
				feast = checkMovable(calendar, this.october[16]);
			else if (day == 21)
				feast = checkMovable(calendar, this.october[17]);
			else if (day == 22)
				feast = checkMovable(calendar, feast);
			else if (day == 23)
				feast = checkMovable(calendar, this.october[18]);
			else if (day == 24)
				feast = checkMovable(calendar, feast);
			else if (day == 25)
				feast = checkMovable(calendar, this.october[19]);
			else if (day == 26)
				feast = checkMovable(calendar, this.october[20]);
			else if (day == 27)
				feast = checkMovable(calendar, feast);
			else if (day == 28)
				feast = checkMovable(calendar, this.october[21]);
			else if (day == 29)
				feast = checkMovable(calendar, feast);
			else if (day == 30)
				feast = checkMovable(calendar, feast);
			else if (day == 31)
				feast = checkMovable(calendar, feast);

			break;
		case 10: // NOVEMBER
			if (day == 1)
				feast = checkMovable(calendar, this.november[0]);
			else if (day == 2)
				feast = checkMovable(calendar, this.november[1]);
			else if (day == 3)
				feast = checkMovable(calendar, feast);
			else if (day == 4)
				feast = checkMovable(calendar, this.november[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.november[3]);
			else if (day == 6)
				feast = checkMovable(calendar, feast);
			else if (day == 7)
				feast = checkMovable(calendar, feast);
			else if (day == 8)
				feast = checkMovable(calendar, this.november[4]);
			else if (day == 9)
				feast = checkMovable(calendar, this.november[5]);
			else if (day == 10)
				feast = checkMovable(calendar, this.november[6]);
			else if (day == 11)
				feast = checkMovable(calendar, this.november[7]);
			else if (day == 12)
				feast = checkMovable(calendar, this.november[8]);
			else if (day == 13)
				feast = checkMovable(calendar, this.november[9]);
			else if (day == 14)
				feast = checkMovable(calendar, feast);
			else if (day == 15)
				feast = checkMovable(calendar, this.november[10]);
			else if (day == 16)
				feast = checkMovable(calendar, this.november[11]);
			else if (day == 17)
				feast = checkMovable(calendar, this.november[12]);
			else if (day == 18)
				feast = checkMovable(calendar, this.november[13]);
			else if (day == 19)
				feast = checkMovable(calendar, this.november[14]);
			else if (day == 20)
				feast = checkMovable(calendar, this.november[15]);
			else if (day == 21)
				feast = checkMovable(calendar, feast);
			else if (day == 22)
				feast = checkMovable(calendar, this.november[16]);
			else if (day == 23)
				feast = checkMovable(calendar, this.november[17]);
			else if (day == 24)
				feast = checkMovable(calendar, this.november[18]);
			else if (day == 25)
				feast = checkMovable(calendar, this.november[19]);
			else if (day == 26)
				feast = checkMovable(calendar, this.november[20]);
			else if (day == 27)
				feast = checkMovable(calendar, this.november[21]);
			else if (day == 28)
				feast = checkMovable(calendar, feast);
			else if (day == 29)
				feast = checkMovable(calendar, this.november[22]);
			else if (day == 30)
				feast = checkMovable(calendar, this.november[23]);

			break;
		case 11: // DECEMBER
			if (day == 1)
				feast = checkMovable(calendar, feast);
			else if (day == 2)
				feast = checkMovable(calendar, this.december[0]);
			else if (day == 3)
				feast = checkMovable(calendar, this.december[1]);
			else if (day == 4)
				feast = checkMovable(calendar, this.december[2]);
			else if (day == 5)
				feast = checkMovable(calendar, this.december[3]);
			else if (day == 6)
				feast = checkMovable(calendar, feast);
			else if (day == 7)
				feast = checkMovable(calendar, this.december[4]);
			else if (day == 8)
				feast = checkMovable(calendar, this.december[5]);
			else if (day == 9)
				feast = checkMovable(calendar, feast);
			else if (day == 10)
				feast = checkMovable(calendar, this.december[6]);
			else if (day == 11)
				feast = checkMovable(calendar, this.december[7]);
			else if (day == 12)
				feast = checkMovable(calendar, this.december[8]);
			else if (day == 13)
				feast = checkMovable(calendar, feast);
			else if (day == 14)
				feast = checkMovable(calendar, feast);
			else if (day == 15)
				feast = checkMovable(calendar, feast);
			else if (day == 16)
				feast = checkMovable(calendar, this.december[9]);
			else if (day == 17)
				feast = checkMovable(calendar, feast);
			else if (day == 18)
				feast = checkMovable(calendar, feast);
			else if (day == 19)
				feast = checkMovable(calendar, feast);
			else if (day == 20)
				feast = checkMovable(calendar, feast);
			else if (day == 21)
				feast = checkMovable(calendar, this.december[10]);
			else if (day == 22)
				feast = checkMovable(calendar, feast);
			else if (day == 23)
				feast = checkMovable(calendar, feast);
			else if (day == 24)
				feast = checkMovable(calendar, this.december[11]);
			else if (day == 25)
				feast = checkMovable(calendar, this.december[12]);
			else if (day == 26)
				feast = checkMovable(calendar, this.december[13]);
			else if (day == 27)
				feast = checkMovable(calendar, this.december[14]);
			else if (day == 28)
				feast = checkMovable(calendar, this.december[15]);
			else if (day == 29)
				feast = checkMovable(calendar, this.december[16]);
			else if (day == 30)
				feast = checkMovable(calendar, feast);
			else if (day == 31)
				feast = checkMovable(calendar, this.december[17]);

			break;
		default:

			break;
		}

		return feast;
	}

}
