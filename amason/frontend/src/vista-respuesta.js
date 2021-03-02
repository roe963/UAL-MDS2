import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-respuesta`
 *
 * VistaRespuesta element.
 *
 * @customElement
 * @polymer
 */
class VistaRespuesta extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
