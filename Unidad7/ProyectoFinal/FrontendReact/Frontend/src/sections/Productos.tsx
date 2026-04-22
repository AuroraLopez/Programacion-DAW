import { useEffect, useState } from "react";

const Productos = () => {
  const [juegos, setJuegos] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8082/videojuegos") 
      .then(res => res.json())
      .then(data => setJuegos(data))
      .catch(err => console.error(err));
  }, []);

  return (
    <>
      <Navbar />
      <div style={{
        display: 'grid',
        gridTemplateColumns: 'repeat(auto-fill, minmax(300px, 1fr))',
        gap: '20px'
      }}>
        {juegos.map(juego => (
          <ExpandableCard key={juego.id} juego={juego} />
        ))}
      </div>
    </>
  );
};

export default Productos;