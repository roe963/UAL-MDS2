import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaRespuesta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <h4 id="h-respuesta">Usuario: </h4>
 <label id="label-mensaje">Mensaje</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-respuesta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRespuesta.is, VistaRespuesta);
