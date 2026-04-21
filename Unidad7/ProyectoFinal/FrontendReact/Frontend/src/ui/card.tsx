import React, { useState } from 'react';

const ExpandableCard = ({ juego }) => {
  const [isExpanded, setIsExpanded] = useState(false);

  const cardStyle = {
    width: '300px',
    padding: '20px',
    borderRadius: '12px',
    boxShadow: '0 4px 12px rgba(0,0,0,0.1)',
    backgroundColor: '#fff',
    cursor: 'pointer',
    transition: 'all 0.3s ease',
    overflow: 'hidden'
  };

  return (
    <div 
      style={cardStyle} 
      onClick={() => setIsExpanded(!isExpanded)}
    >
      {/* Imagen */}
      {juego.url && (
        <img 
          src={juego.url} 
          alt={juego.titulo} 
          style={{ width: '80%', borderRadius: '8px' }}
        />
      )}

      {/* Contenido principal */}
      <div style={{ marginTop: '10px' }}>
        <h2>{juego.titulo}</h2>
        <p style={{ color: '#666' }}>{juego.creador}</p>
      </div>

      {/* Expandible */}
      {isExpanded && (
        <div style={{ marginTop: '15px', borderTop: '1px solid #eee', paddingTop: '10px' }}>
          <p><strong>Género:</strong> {juego.genero}</p>
          <p><strong>Modo de juego:</strong> {juego.mododejuego}</p>
          <p><strong>PEGI:</strong> {juego.pegi}</p>
          <p><strong>Precio:</strong> {juego.precio} €</p>
          <p><strong>Fecha:</strong> {new Date(juego.fecha_lanzamiento).toLocaleDateString()}</p>
        </div>
      )}
    </div>
  );
};

export default ExpandableCard;