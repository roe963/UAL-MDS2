import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-respuestas`
 *
 * VistaRespuestas element.
 *
 * @customElement
 * @polymer
 */
class VistaRespuestas extends PolymerElement {

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
        return 'vista-respuestas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRespuestas.is, VistaRespuestas);
